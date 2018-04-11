
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.codecommit.AWSCodeCommit
import com.amazonaws.services.codecommit.model.*

var codingue.koops.core.Environment.codecommit: AWSCodeCommit
	get() = this.capabilities[AWSCodeCommit::class.java.name] as AWSCodeCommit
	set(codecommit) {
		this.capabilities[AWSCodeCommit::class.java.name] = codecommit
	}

@Generated
class AWSCodeCommitFunctions(val block: Block)

infix fun <T> AwsContinuation.codecommit(init: AWSCodeCommitFunctions.() -> T): T {
	return AWSCodeCommitFunctions(shell).run(init)
}

			

fun AWSCodeCommitFunctions.batchGetRepositories(init: AWSCodeCommitBatchGetRepositoriesCommand.() -> Unit): com.amazonaws.services.codecommit.model.BatchGetRepositoriesResult {
	return this.block.declare(AWSCodeCommitBatchGetRepositoriesCommand().apply(init)) as com.amazonaws.services.codecommit.model.BatchGetRepositoriesResult
}

@Generated
class AWSCodeCommitBatchGetRepositoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest, com.amazonaws.services.codecommit.model.BatchGetRepositoriesResult> {

	var repositoryNames: List<String>? = null

	override fun build(): com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest {
		val input = com.amazonaws.services.codecommit.model.BatchGetRepositoriesRequest()
		input.setRepositoryNames(this.repositoryNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.BatchGetRepositoriesResult {
	  return com.amazonaws.services.codecommit.model.BatchGetRepositoriesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.BatchGetRepositoriesResult {
		return environment.codecommit.batchGetRepositories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit batch-get-repositories")
				.argument("repository-names", repositoryNames?.toString())
	}

}


fun AWSCodeCommitFunctions.createBranch(init: AWSCodeCommitCreateBranchCommand.() -> Unit): com.amazonaws.services.codecommit.model.CreateBranchResult {
	return this.block.declare(AWSCodeCommitCreateBranchCommand().apply(init)) as com.amazonaws.services.codecommit.model.CreateBranchResult
}

@Generated
class AWSCodeCommitCreateBranchCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.CreateBranchRequest, com.amazonaws.services.codecommit.model.CreateBranchResult> {

	var repositoryName: String? = null
	var branchName: String? = null
	var commitId: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.CreateBranchRequest {
		val input = com.amazonaws.services.codecommit.model.CreateBranchRequest()
		input.setRepositoryName(this.repositoryName)
		input.setBranchName(this.branchName)
		input.setCommitId(this.commitId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.CreateBranchResult {
	  return com.amazonaws.services.codecommit.model.CreateBranchResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.CreateBranchResult {
		return environment.codecommit.createBranch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit create-branch")
				.argument("repository-name", repositoryName)
				.argument("branch-name", branchName)
				.argument("commit-id", commitId)
	}

}


fun AWSCodeCommitFunctions.createPullRequest(init: AWSCodeCommitCreatePullRequestCommand.() -> Unit): com.amazonaws.services.codecommit.model.CreatePullRequestResult {
	return this.block.declare(AWSCodeCommitCreatePullRequestCommand().apply(init)) as com.amazonaws.services.codecommit.model.CreatePullRequestResult
}

@Generated
class AWSCodeCommitCreatePullRequestCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.CreatePullRequestRequest, com.amazonaws.services.codecommit.model.CreatePullRequestResult> {

	var title: String? = null
	var description: String? = null
	var targets: List<com.amazonaws.services.codecommit.model.Target>? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.CreatePullRequestRequest {
		val input = com.amazonaws.services.codecommit.model.CreatePullRequestRequest()
		input.setTitle(this.title)
		input.setDescription(this.description)
		input.setTargets(this.targets)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.CreatePullRequestResult {
	  return com.amazonaws.services.codecommit.model.CreatePullRequestResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.CreatePullRequestResult {
		return environment.codecommit.createPullRequest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit create-pull-request")
				.argument("title", title)
				.argument("description", description)
				.argument("targets", targets?.toString())
				.argument("client-request-token", clientRequestToken)
	}

}


fun AWSCodeCommitFunctions.createRepository(init: AWSCodeCommitCreateRepositoryCommand.() -> Unit): com.amazonaws.services.codecommit.model.CreateRepositoryResult {
	return this.block.declare(AWSCodeCommitCreateRepositoryCommand().apply(init)) as com.amazonaws.services.codecommit.model.CreateRepositoryResult
}

@Generated
class AWSCodeCommitCreateRepositoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.CreateRepositoryRequest, com.amazonaws.services.codecommit.model.CreateRepositoryResult> {

	var repositoryName: String? = null
	var repositoryDescription: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.CreateRepositoryRequest {
		val input = com.amazonaws.services.codecommit.model.CreateRepositoryRequest()
		input.setRepositoryName(this.repositoryName)
		input.setRepositoryDescription(this.repositoryDescription)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.CreateRepositoryResult {
	  return com.amazonaws.services.codecommit.model.CreateRepositoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.CreateRepositoryResult {
		return environment.codecommit.createRepository(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit create-repository")
				.argument("repository-name", repositoryName)
				.argument("repository-description", repositoryDescription)
	}

}


fun AWSCodeCommitFunctions.deleteBranch(init: AWSCodeCommitDeleteBranchCommand.() -> Unit): com.amazonaws.services.codecommit.model.DeleteBranchResult {
	return this.block.declare(AWSCodeCommitDeleteBranchCommand().apply(init)) as com.amazonaws.services.codecommit.model.DeleteBranchResult
}

@Generated
class AWSCodeCommitDeleteBranchCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.DeleteBranchRequest, com.amazonaws.services.codecommit.model.DeleteBranchResult> {

	var repositoryName: String? = null
	var branchName: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.DeleteBranchRequest {
		val input = com.amazonaws.services.codecommit.model.DeleteBranchRequest()
		input.setRepositoryName(this.repositoryName)
		input.setBranchName(this.branchName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.DeleteBranchResult {
	  return com.amazonaws.services.codecommit.model.DeleteBranchResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.DeleteBranchResult {
		return environment.codecommit.deleteBranch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit delete-branch")
				.argument("repository-name", repositoryName)
				.argument("branch-name", branchName)
	}

}


fun AWSCodeCommitFunctions.deleteCommentContent(init: AWSCodeCommitDeleteCommentContentCommand.() -> Unit): com.amazonaws.services.codecommit.model.DeleteCommentContentResult {
	return this.block.declare(AWSCodeCommitDeleteCommentContentCommand().apply(init)) as com.amazonaws.services.codecommit.model.DeleteCommentContentResult
}

@Generated
class AWSCodeCommitDeleteCommentContentCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.DeleteCommentContentRequest, com.amazonaws.services.codecommit.model.DeleteCommentContentResult> {

	var commentId: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.DeleteCommentContentRequest {
		val input = com.amazonaws.services.codecommit.model.DeleteCommentContentRequest()
		input.setCommentId(this.commentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.DeleteCommentContentResult {
	  return com.amazonaws.services.codecommit.model.DeleteCommentContentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.DeleteCommentContentResult {
		return environment.codecommit.deleteCommentContent(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit delete-comment-content")
				.argument("comment-id", commentId)
	}

}


fun AWSCodeCommitFunctions.deleteRepository(init: AWSCodeCommitDeleteRepositoryCommand.() -> Unit): com.amazonaws.services.codecommit.model.DeleteRepositoryResult {
	return this.block.declare(AWSCodeCommitDeleteRepositoryCommand().apply(init)) as com.amazonaws.services.codecommit.model.DeleteRepositoryResult
}

@Generated
class AWSCodeCommitDeleteRepositoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.DeleteRepositoryRequest, com.amazonaws.services.codecommit.model.DeleteRepositoryResult> {

	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.DeleteRepositoryRequest {
		val input = com.amazonaws.services.codecommit.model.DeleteRepositoryRequest()
		input.setRepositoryName(this.repositoryName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.DeleteRepositoryResult {
	  return com.amazonaws.services.codecommit.model.DeleteRepositoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.DeleteRepositoryResult {
		return environment.codecommit.deleteRepository(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit delete-repository")
				.argument("repository-name", repositoryName)
	}

}


fun AWSCodeCommitFunctions.describePullRequestEvents(init: AWSCodeCommitDescribePullRequestEventsCommand.() -> Unit): com.amazonaws.services.codecommit.model.DescribePullRequestEventsResult {
	return this.block.declare(AWSCodeCommitDescribePullRequestEventsCommand().apply(init)) as com.amazonaws.services.codecommit.model.DescribePullRequestEventsResult
}

@Generated
class AWSCodeCommitDescribePullRequestEventsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest, com.amazonaws.services.codecommit.model.DescribePullRequestEventsResult> {

	var pullRequestId: String? = null
	var pullRequestEventType: PullRequestEventType? = null
	var actorArn: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest {
		val input = com.amazonaws.services.codecommit.model.DescribePullRequestEventsRequest()
		input.setPullRequestId(this.pullRequestId)
		input.setPullRequestEventType(this.pullRequestEventType?.toString())
		input.setActorArn(this.actorArn)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.DescribePullRequestEventsResult {
	  return com.amazonaws.services.codecommit.model.DescribePullRequestEventsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.DescribePullRequestEventsResult {
		return environment.codecommit.describePullRequestEvents(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit describe-pull-request-events")
				.argument("pull-request-id", pullRequestId)
				.argument("pull-request-event-type", pullRequestEventType?.toString())
				.argument("actor-arn", actorArn)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeCommitFunctions.getBlob(init: AWSCodeCommitGetBlobCommand.() -> Unit): com.amazonaws.services.codecommit.model.GetBlobResult {
	return this.block.declare(AWSCodeCommitGetBlobCommand().apply(init)) as com.amazonaws.services.codecommit.model.GetBlobResult
}

@Generated
class AWSCodeCommitGetBlobCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.GetBlobRequest, com.amazonaws.services.codecommit.model.GetBlobResult> {

	var repositoryName: String? = null
	var blobId: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.GetBlobRequest {
		val input = com.amazonaws.services.codecommit.model.GetBlobRequest()
		input.setRepositoryName(this.repositoryName)
		input.setBlobId(this.blobId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.GetBlobResult {
	  return com.amazonaws.services.codecommit.model.GetBlobResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.GetBlobResult {
		return environment.codecommit.getBlob(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit get-blob")
				.argument("repository-name", repositoryName)
				.argument("blob-id", blobId)
	}

}


fun AWSCodeCommitFunctions.getBranch(init: AWSCodeCommitGetBranchCommand.() -> Unit): com.amazonaws.services.codecommit.model.GetBranchResult {
	return this.block.declare(AWSCodeCommitGetBranchCommand().apply(init)) as com.amazonaws.services.codecommit.model.GetBranchResult
}

@Generated
class AWSCodeCommitGetBranchCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.GetBranchRequest, com.amazonaws.services.codecommit.model.GetBranchResult> {

	var repositoryName: String? = null
	var branchName: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.GetBranchRequest {
		val input = com.amazonaws.services.codecommit.model.GetBranchRequest()
		input.setRepositoryName(this.repositoryName)
		input.setBranchName(this.branchName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.GetBranchResult {
	  return com.amazonaws.services.codecommit.model.GetBranchResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.GetBranchResult {
		return environment.codecommit.getBranch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit get-branch")
				.argument("repository-name", repositoryName)
				.argument("branch-name", branchName)
	}

}


fun AWSCodeCommitFunctions.getComment(init: AWSCodeCommitGetCommentCommand.() -> Unit): com.amazonaws.services.codecommit.model.GetCommentResult {
	return this.block.declare(AWSCodeCommitGetCommentCommand().apply(init)) as com.amazonaws.services.codecommit.model.GetCommentResult
}

@Generated
class AWSCodeCommitGetCommentCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.GetCommentRequest, com.amazonaws.services.codecommit.model.GetCommentResult> {

	var commentId: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.GetCommentRequest {
		val input = com.amazonaws.services.codecommit.model.GetCommentRequest()
		input.setCommentId(this.commentId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.GetCommentResult {
	  return com.amazonaws.services.codecommit.model.GetCommentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.GetCommentResult {
		return environment.codecommit.getComment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit get-comment")
				.argument("comment-id", commentId)
	}

}


fun AWSCodeCommitFunctions.getCommentsForComparedCommit(init: AWSCodeCommitGetCommentsForComparedCommitCommand.() -> Unit): com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitResult {
	return this.block.declare(AWSCodeCommitGetCommentsForComparedCommitCommand().apply(init)) as com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitResult
}

@Generated
class AWSCodeCommitGetCommentsForComparedCommitCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest, com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitResult> {

	var repositoryName: String? = null
	var beforeCommitId: String? = null
	var afterCommitId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest {
		val input = com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitRequest()
		input.setRepositoryName(this.repositoryName)
		input.setBeforeCommitId(this.beforeCommitId)
		input.setAfterCommitId(this.afterCommitId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitResult {
	  return com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.GetCommentsForComparedCommitResult {
		return environment.codecommit.getCommentsForComparedCommit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit get-comments-for-compared-commit")
				.argument("repository-name", repositoryName)
				.argument("before-commit-id", beforeCommitId)
				.argument("after-commit-id", afterCommitId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeCommitFunctions.getCommentsForPullRequest(init: AWSCodeCommitGetCommentsForPullRequestCommand.() -> Unit): com.amazonaws.services.codecommit.model.GetCommentsForPullRequestResult {
	return this.block.declare(AWSCodeCommitGetCommentsForPullRequestCommand().apply(init)) as com.amazonaws.services.codecommit.model.GetCommentsForPullRequestResult
}

@Generated
class AWSCodeCommitGetCommentsForPullRequestCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest, com.amazonaws.services.codecommit.model.GetCommentsForPullRequestResult> {

	var pullRequestId: String? = null
	var repositoryName: String? = null
	var beforeCommitId: String? = null
	var afterCommitId: String? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest {
		val input = com.amazonaws.services.codecommit.model.GetCommentsForPullRequestRequest()
		input.setPullRequestId(this.pullRequestId)
		input.setRepositoryName(this.repositoryName)
		input.setBeforeCommitId(this.beforeCommitId)
		input.setAfterCommitId(this.afterCommitId)
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.GetCommentsForPullRequestResult {
	  return com.amazonaws.services.codecommit.model.GetCommentsForPullRequestResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.GetCommentsForPullRequestResult {
		return environment.codecommit.getCommentsForPullRequest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit get-comments-for-pull-request")
				.argument("pull-request-id", pullRequestId)
				.argument("repository-name", repositoryName)
				.argument("before-commit-id", beforeCommitId)
				.argument("after-commit-id", afterCommitId)
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeCommitFunctions.getCommit(init: AWSCodeCommitGetCommitCommand.() -> Unit): com.amazonaws.services.codecommit.model.GetCommitResult {
	return this.block.declare(AWSCodeCommitGetCommitCommand().apply(init)) as com.amazonaws.services.codecommit.model.GetCommitResult
}

@Generated
class AWSCodeCommitGetCommitCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.GetCommitRequest, com.amazonaws.services.codecommit.model.GetCommitResult> {

	var repositoryName: String? = null
	var commitId: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.GetCommitRequest {
		val input = com.amazonaws.services.codecommit.model.GetCommitRequest()
		input.setRepositoryName(this.repositoryName)
		input.setCommitId(this.commitId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.GetCommitResult {
	  return com.amazonaws.services.codecommit.model.GetCommitResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.GetCommitResult {
		return environment.codecommit.getCommit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit get-commit")
				.argument("repository-name", repositoryName)
				.argument("commit-id", commitId)
	}

}


fun AWSCodeCommitFunctions.getDifferences(init: AWSCodeCommitGetDifferencesCommand.() -> Unit): com.amazonaws.services.codecommit.model.GetDifferencesResult {
	return this.block.declare(AWSCodeCommitGetDifferencesCommand().apply(init)) as com.amazonaws.services.codecommit.model.GetDifferencesResult
}

@Generated
class AWSCodeCommitGetDifferencesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.GetDifferencesRequest, com.amazonaws.services.codecommit.model.GetDifferencesResult> {

	var repositoryName: String? = null
	var beforeCommitSpecifier: String? = null
	var afterCommitSpecifier: String? = null
	var beforePath: String? = null
	var afterPath: String? = null
	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.GetDifferencesRequest {
		val input = com.amazonaws.services.codecommit.model.GetDifferencesRequest()
		input.setRepositoryName(this.repositoryName)
		input.setBeforeCommitSpecifier(this.beforeCommitSpecifier)
		input.setAfterCommitSpecifier(this.afterCommitSpecifier)
		input.setBeforePath(this.beforePath)
		input.setAfterPath(this.afterPath)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.GetDifferencesResult {
	  return com.amazonaws.services.codecommit.model.GetDifferencesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.GetDifferencesResult {
		return environment.codecommit.getDifferences(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit get-differences")
				.argument("repository-name", repositoryName)
				.argument("before-commit-specifier", beforeCommitSpecifier)
				.argument("after-commit-specifier", afterCommitSpecifier)
				.argument("before-path", beforePath)
				.argument("after-path", afterPath)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSCodeCommitFunctions.getMergeConflicts(init: AWSCodeCommitGetMergeConflictsCommand.() -> Unit): com.amazonaws.services.codecommit.model.GetMergeConflictsResult {
	return this.block.declare(AWSCodeCommitGetMergeConflictsCommand().apply(init)) as com.amazonaws.services.codecommit.model.GetMergeConflictsResult
}

@Generated
class AWSCodeCommitGetMergeConflictsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.GetMergeConflictsRequest, com.amazonaws.services.codecommit.model.GetMergeConflictsResult> {

	var repositoryName: String? = null
	var destinationCommitSpecifier: String? = null
	var sourceCommitSpecifier: String? = null
	var mergeOption: MergeOptionTypeEnum? = null

	override fun build(): com.amazonaws.services.codecommit.model.GetMergeConflictsRequest {
		val input = com.amazonaws.services.codecommit.model.GetMergeConflictsRequest()
		input.setRepositoryName(this.repositoryName)
		input.setDestinationCommitSpecifier(this.destinationCommitSpecifier)
		input.setSourceCommitSpecifier(this.sourceCommitSpecifier)
		input.setMergeOption(this.mergeOption?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.GetMergeConflictsResult {
	  return com.amazonaws.services.codecommit.model.GetMergeConflictsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.GetMergeConflictsResult {
		return environment.codecommit.getMergeConflicts(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit get-merge-conflicts")
				.argument("repository-name", repositoryName)
				.argument("destination-commit-specifier", destinationCommitSpecifier)
				.argument("source-commit-specifier", sourceCommitSpecifier)
				.argument("merge-option", mergeOption?.toString())
	}

}


fun AWSCodeCommitFunctions.getPullRequest(init: AWSCodeCommitGetPullRequestCommand.() -> Unit): com.amazonaws.services.codecommit.model.GetPullRequestResult {
	return this.block.declare(AWSCodeCommitGetPullRequestCommand().apply(init)) as com.amazonaws.services.codecommit.model.GetPullRequestResult
}

@Generated
class AWSCodeCommitGetPullRequestCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.GetPullRequestRequest, com.amazonaws.services.codecommit.model.GetPullRequestResult> {

	var pullRequestId: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.GetPullRequestRequest {
		val input = com.amazonaws.services.codecommit.model.GetPullRequestRequest()
		input.setPullRequestId(this.pullRequestId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.GetPullRequestResult {
	  return com.amazonaws.services.codecommit.model.GetPullRequestResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.GetPullRequestResult {
		return environment.codecommit.getPullRequest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit get-pull-request")
				.argument("pull-request-id", pullRequestId)
	}

}


fun AWSCodeCommitFunctions.getRepository(init: AWSCodeCommitGetRepositoryCommand.() -> Unit): com.amazonaws.services.codecommit.model.GetRepositoryResult {
	return this.block.declare(AWSCodeCommitGetRepositoryCommand().apply(init)) as com.amazonaws.services.codecommit.model.GetRepositoryResult
}

@Generated
class AWSCodeCommitGetRepositoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.GetRepositoryRequest, com.amazonaws.services.codecommit.model.GetRepositoryResult> {

	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.GetRepositoryRequest {
		val input = com.amazonaws.services.codecommit.model.GetRepositoryRequest()
		input.setRepositoryName(this.repositoryName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.GetRepositoryResult {
	  return com.amazonaws.services.codecommit.model.GetRepositoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.GetRepositoryResult {
		return environment.codecommit.getRepository(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit get-repository")
				.argument("repository-name", repositoryName)
	}

}


fun AWSCodeCommitFunctions.getRepositoryTriggers(init: AWSCodeCommitGetRepositoryTriggersCommand.() -> Unit): com.amazonaws.services.codecommit.model.GetRepositoryTriggersResult {
	return this.block.declare(AWSCodeCommitGetRepositoryTriggersCommand().apply(init)) as com.amazonaws.services.codecommit.model.GetRepositoryTriggersResult
}

@Generated
class AWSCodeCommitGetRepositoryTriggersCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest, com.amazonaws.services.codecommit.model.GetRepositoryTriggersResult> {

	var repositoryName: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest {
		val input = com.amazonaws.services.codecommit.model.GetRepositoryTriggersRequest()
		input.setRepositoryName(this.repositoryName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.GetRepositoryTriggersResult {
	  return com.amazonaws.services.codecommit.model.GetRepositoryTriggersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.GetRepositoryTriggersResult {
		return environment.codecommit.getRepositoryTriggers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit get-repository-triggers")
				.argument("repository-name", repositoryName)
	}

}


fun AWSCodeCommitFunctions.listBranches(init: AWSCodeCommitListBranchesCommand.() -> Unit): com.amazonaws.services.codecommit.model.ListBranchesResult {
	return this.block.declare(AWSCodeCommitListBranchesCommand().apply(init)) as com.amazonaws.services.codecommit.model.ListBranchesResult
}

@Generated
class AWSCodeCommitListBranchesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.ListBranchesRequest, com.amazonaws.services.codecommit.model.ListBranchesResult> {

	var repositoryName: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.ListBranchesRequest {
		val input = com.amazonaws.services.codecommit.model.ListBranchesRequest()
		input.setRepositoryName(this.repositoryName)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.ListBranchesResult {
	  return com.amazonaws.services.codecommit.model.ListBranchesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.ListBranchesResult {
		return environment.codecommit.listBranches(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit list-branches")
				.argument("repository-name", repositoryName)
				.argument("next-token", nextToken)
	}

}


fun AWSCodeCommitFunctions.listPullRequests(init: AWSCodeCommitListPullRequestsCommand.() -> Unit): com.amazonaws.services.codecommit.model.ListPullRequestsResult {
	return this.block.declare(AWSCodeCommitListPullRequestsCommand().apply(init)) as com.amazonaws.services.codecommit.model.ListPullRequestsResult
}

@Generated
class AWSCodeCommitListPullRequestsCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.ListPullRequestsRequest, com.amazonaws.services.codecommit.model.ListPullRequestsResult> {

	var repositoryName: String? = null
	var authorArn: String? = null
	var pullRequestStatus: PullRequestStatusEnum? = null
	var nextToken: String? = null
	var maxResults: Int? = 0

	override fun build(): com.amazonaws.services.codecommit.model.ListPullRequestsRequest {
		val input = com.amazonaws.services.codecommit.model.ListPullRequestsRequest()
		input.setRepositoryName(this.repositoryName)
		input.setAuthorArn(this.authorArn)
		input.setPullRequestStatus(this.pullRequestStatus?.toString())
		input.setNextToken(this.nextToken)
		input.setMaxResults(this.maxResults)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.ListPullRequestsResult {
	  return com.amazonaws.services.codecommit.model.ListPullRequestsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.ListPullRequestsResult {
		return environment.codecommit.listPullRequests(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit list-pull-requests")
				.argument("repository-name", repositoryName)
				.argument("author-arn", authorArn)
				.argument("pull-request-status", pullRequestStatus?.toString())
				.argument("next-token", nextToken)
				.argument("max-results", maxResults?.toString())
	}

}


fun AWSCodeCommitFunctions.listRepositories(init: AWSCodeCommitListRepositoriesCommand.() -> Unit): com.amazonaws.services.codecommit.model.ListRepositoriesResult {
	return this.block.declare(AWSCodeCommitListRepositoriesCommand().apply(init)) as com.amazonaws.services.codecommit.model.ListRepositoriesResult
}

@Generated
class AWSCodeCommitListRepositoriesCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.ListRepositoriesRequest, com.amazonaws.services.codecommit.model.ListRepositoriesResult> {

	var nextToken: String? = null
	var sortBy: SortByEnum? = null
	var order: OrderEnum? = null

	override fun build(): com.amazonaws.services.codecommit.model.ListRepositoriesRequest {
		val input = com.amazonaws.services.codecommit.model.ListRepositoriesRequest()
		input.setNextToken(this.nextToken)
		input.setSortBy(this.sortBy?.toString())
		input.setOrder(this.order?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.ListRepositoriesResult {
	  return com.amazonaws.services.codecommit.model.ListRepositoriesResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.ListRepositoriesResult {
		return environment.codecommit.listRepositories(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit list-repositories")
				.argument("next-token", nextToken)
				.argument("sort-by", sortBy?.toString())
				.argument("order", order?.toString())
	}

}


fun AWSCodeCommitFunctions.mergePullRequestByFastForward(init: AWSCodeCommitMergePullRequestByFastForwardCommand.() -> Unit): com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardResult {
	return this.block.declare(AWSCodeCommitMergePullRequestByFastForwardCommand().apply(init)) as com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardResult
}

@Generated
class AWSCodeCommitMergePullRequestByFastForwardCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest, com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardResult> {

	var pullRequestId: String? = null
	var repositoryName: String? = null
	var sourceCommitId: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest {
		val input = com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardRequest()
		input.setPullRequestId(this.pullRequestId)
		input.setRepositoryName(this.repositoryName)
		input.setSourceCommitId(this.sourceCommitId)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardResult {
	  return com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.MergePullRequestByFastForwardResult {
		return environment.codecommit.mergePullRequestByFastForward(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit merge-pull-request-by-fast-forward")
				.argument("pull-request-id", pullRequestId)
				.argument("repository-name", repositoryName)
				.argument("source-commit-id", sourceCommitId)
	}

}


fun AWSCodeCommitFunctions.postCommentForComparedCommit(init: AWSCodeCommitPostCommentForComparedCommitCommand.() -> Unit): com.amazonaws.services.codecommit.model.PostCommentForComparedCommitResult {
	return this.block.declare(AWSCodeCommitPostCommentForComparedCommitCommand().apply(init)) as com.amazonaws.services.codecommit.model.PostCommentForComparedCommitResult
}

@Generated
class AWSCodeCommitPostCommentForComparedCommitCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest, com.amazonaws.services.codecommit.model.PostCommentForComparedCommitResult> {

	var repositoryName: String? = null
	var beforeCommitId: String? = null
	var afterCommitId: String? = null
	var location: com.amazonaws.services.codecommit.model.Location? = null
	var content: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest {
		val input = com.amazonaws.services.codecommit.model.PostCommentForComparedCommitRequest()
		input.setRepositoryName(this.repositoryName)
		input.setBeforeCommitId(this.beforeCommitId)
		input.setAfterCommitId(this.afterCommitId)
		input.setLocation(this.location)
		input.setContent(this.content)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.PostCommentForComparedCommitResult {
	  return com.amazonaws.services.codecommit.model.PostCommentForComparedCommitResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.PostCommentForComparedCommitResult {
		return environment.codecommit.postCommentForComparedCommit(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit post-comment-for-compared-commit")
				.argument("repository-name", repositoryName)
				.argument("before-commit-id", beforeCommitId)
				.argument("after-commit-id", afterCommitId)
				.argument("location", location?.toString())
				.argument("content", content)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AWSCodeCommitFunctions.postCommentForPullRequest(init: AWSCodeCommitPostCommentForPullRequestCommand.() -> Unit): com.amazonaws.services.codecommit.model.PostCommentForPullRequestResult {
	return this.block.declare(AWSCodeCommitPostCommentForPullRequestCommand().apply(init)) as com.amazonaws.services.codecommit.model.PostCommentForPullRequestResult
}

@Generated
class AWSCodeCommitPostCommentForPullRequestCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest, com.amazonaws.services.codecommit.model.PostCommentForPullRequestResult> {

	var pullRequestId: String? = null
	var repositoryName: String? = null
	var beforeCommitId: String? = null
	var afterCommitId: String? = null
	var location: com.amazonaws.services.codecommit.model.Location? = null
	var content: String? = null
	var clientRequestToken: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest {
		val input = com.amazonaws.services.codecommit.model.PostCommentForPullRequestRequest()
		input.setPullRequestId(this.pullRequestId)
		input.setRepositoryName(this.repositoryName)
		input.setBeforeCommitId(this.beforeCommitId)
		input.setAfterCommitId(this.afterCommitId)
		input.setLocation(this.location)
		input.setContent(this.content)
		input.setClientRequestToken(this.clientRequestToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.PostCommentForPullRequestResult {
	  return com.amazonaws.services.codecommit.model.PostCommentForPullRequestResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.PostCommentForPullRequestResult {
		return environment.codecommit.postCommentForPullRequest(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit post-comment-for-pull-request")
				.argument("pull-request-id", pullRequestId)
				.argument("repository-name", repositoryName)
				.argument("before-commit-id", beforeCommitId)
				.argument("after-commit-id", afterCommitId)
				.argument("location", location?.toString())
				.argument("content", content)
				.argument("client-request-token", clientRequestToken)
	}

}


fun AWSCodeCommitFunctions.postCommentReply(init: AWSCodeCommitPostCommentReplyCommand.() -> Unit): com.amazonaws.services.codecommit.model.PostCommentReplyResult {
	return this.block.declare(AWSCodeCommitPostCommentReplyCommand().apply(init)) as com.amazonaws.services.codecommit.model.PostCommentReplyResult
}

@Generated
class AWSCodeCommitPostCommentReplyCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.PostCommentReplyRequest, com.amazonaws.services.codecommit.model.PostCommentReplyResult> {

	var inReplyTo: String? = null
	var clientRequestToken: String? = null
	var content: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.PostCommentReplyRequest {
		val input = com.amazonaws.services.codecommit.model.PostCommentReplyRequest()
		input.setInReplyTo(this.inReplyTo)
		input.setClientRequestToken(this.clientRequestToken)
		input.setContent(this.content)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.PostCommentReplyResult {
	  return com.amazonaws.services.codecommit.model.PostCommentReplyResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.PostCommentReplyResult {
		return environment.codecommit.postCommentReply(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit post-comment-reply")
				.argument("in-reply-to", inReplyTo)
				.argument("client-request-token", clientRequestToken)
				.argument("content", content)
	}

}


fun AWSCodeCommitFunctions.putFile(init: AWSCodeCommitPutFileCommand.() -> Unit): com.amazonaws.services.codecommit.model.PutFileResult {
	return this.block.declare(AWSCodeCommitPutFileCommand().apply(init)) as com.amazonaws.services.codecommit.model.PutFileResult
}

@Generated
class AWSCodeCommitPutFileCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.PutFileRequest, com.amazonaws.services.codecommit.model.PutFileResult> {

	var repositoryName: String? = null
	var branchName: String? = null
	var fileContent: java.nio.ByteBuffer? = null
	var filePath: String? = null
	var fileMode: FileModeTypeEnum? = null
	var parentCommitId: String? = null
	var commitMessage: String? = null
	var name: String? = null
	var email: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.PutFileRequest {
		val input = com.amazonaws.services.codecommit.model.PutFileRequest()
		input.setRepositoryName(this.repositoryName)
		input.setBranchName(this.branchName)
		input.setFileContent(this.fileContent)
		input.setFilePath(this.filePath)
		input.setFileMode(this.fileMode?.toString())
		input.setParentCommitId(this.parentCommitId)
		input.setCommitMessage(this.commitMessage)
		input.setName(this.name)
		input.setEmail(this.email)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.PutFileResult {
	  return com.amazonaws.services.codecommit.model.PutFileResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.PutFileResult {
		return environment.codecommit.putFile(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit put-file")
				.argument("repository-name", repositoryName)
				.argument("branch-name", branchName)
				.argument("file-content", fileContent?.toString())
				.argument("file-path", filePath)
				.argument("file-mode", fileMode?.toString())
				.argument("parent-commit-id", parentCommitId)
				.argument("commit-message", commitMessage)
				.argument("name", name)
				.argument("email", email)
	}

}


fun AWSCodeCommitFunctions.putRepositoryTriggers(init: AWSCodeCommitPutRepositoryTriggersCommand.() -> Unit): com.amazonaws.services.codecommit.model.PutRepositoryTriggersResult {
	return this.block.declare(AWSCodeCommitPutRepositoryTriggersCommand().apply(init)) as com.amazonaws.services.codecommit.model.PutRepositoryTriggersResult
}

@Generated
class AWSCodeCommitPutRepositoryTriggersCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest, com.amazonaws.services.codecommit.model.PutRepositoryTriggersResult> {

	var repositoryName: String? = null
	var triggers: List<com.amazonaws.services.codecommit.model.RepositoryTrigger>? = null

	override fun build(): com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest {
		val input = com.amazonaws.services.codecommit.model.PutRepositoryTriggersRequest()
		input.setRepositoryName(this.repositoryName)
		input.setTriggers(this.triggers)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.PutRepositoryTriggersResult {
	  return com.amazonaws.services.codecommit.model.PutRepositoryTriggersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.PutRepositoryTriggersResult {
		return environment.codecommit.putRepositoryTriggers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit put-repository-triggers")
				.argument("repository-name", repositoryName)
				.argument("triggers", triggers?.toString())
	}

}


fun AWSCodeCommitFunctions.testRepositoryTriggers(init: AWSCodeCommitTestRepositoryTriggersCommand.() -> Unit): com.amazonaws.services.codecommit.model.TestRepositoryTriggersResult {
	return this.block.declare(AWSCodeCommitTestRepositoryTriggersCommand().apply(init)) as com.amazonaws.services.codecommit.model.TestRepositoryTriggersResult
}

@Generated
class AWSCodeCommitTestRepositoryTriggersCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest, com.amazonaws.services.codecommit.model.TestRepositoryTriggersResult> {

	var repositoryName: String? = null
	var triggers: List<com.amazonaws.services.codecommit.model.RepositoryTrigger>? = null

	override fun build(): com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest {
		val input = com.amazonaws.services.codecommit.model.TestRepositoryTriggersRequest()
		input.setRepositoryName(this.repositoryName)
		input.setTriggers(this.triggers)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.TestRepositoryTriggersResult {
	  return com.amazonaws.services.codecommit.model.TestRepositoryTriggersResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.TestRepositoryTriggersResult {
		return environment.codecommit.testRepositoryTriggers(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit test-repository-triggers")
				.argument("repository-name", repositoryName)
				.argument("triggers", triggers?.toString())
	}

}


fun AWSCodeCommitFunctions.updateComment(init: AWSCodeCommitUpdateCommentCommand.() -> Unit): com.amazonaws.services.codecommit.model.UpdateCommentResult {
	return this.block.declare(AWSCodeCommitUpdateCommentCommand().apply(init)) as com.amazonaws.services.codecommit.model.UpdateCommentResult
}

@Generated
class AWSCodeCommitUpdateCommentCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.UpdateCommentRequest, com.amazonaws.services.codecommit.model.UpdateCommentResult> {

	var commentId: String? = null
	var content: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.UpdateCommentRequest {
		val input = com.amazonaws.services.codecommit.model.UpdateCommentRequest()
		input.setCommentId(this.commentId)
		input.setContent(this.content)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.UpdateCommentResult {
	  return com.amazonaws.services.codecommit.model.UpdateCommentResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.UpdateCommentResult {
		return environment.codecommit.updateComment(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit update-comment")
				.argument("comment-id", commentId)
				.argument("content", content)
	}

}


fun AWSCodeCommitFunctions.updateDefaultBranch(init: AWSCodeCommitUpdateDefaultBranchCommand.() -> Unit): com.amazonaws.services.codecommit.model.UpdateDefaultBranchResult {
	return this.block.declare(AWSCodeCommitUpdateDefaultBranchCommand().apply(init)) as com.amazonaws.services.codecommit.model.UpdateDefaultBranchResult
}

@Generated
class AWSCodeCommitUpdateDefaultBranchCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest, com.amazonaws.services.codecommit.model.UpdateDefaultBranchResult> {

	var repositoryName: String? = null
	var defaultBranchName: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest {
		val input = com.amazonaws.services.codecommit.model.UpdateDefaultBranchRequest()
		input.setRepositoryName(this.repositoryName)
		input.setDefaultBranchName(this.defaultBranchName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.UpdateDefaultBranchResult {
	  return com.amazonaws.services.codecommit.model.UpdateDefaultBranchResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.UpdateDefaultBranchResult {
		return environment.codecommit.updateDefaultBranch(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit update-default-branch")
				.argument("repository-name", repositoryName)
				.argument("default-branch-name", defaultBranchName)
	}

}


fun AWSCodeCommitFunctions.updatePullRequestDescription(init: AWSCodeCommitUpdatePullRequestDescriptionCommand.() -> Unit): com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionResult {
	return this.block.declare(AWSCodeCommitUpdatePullRequestDescriptionCommand().apply(init)) as com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionResult
}

@Generated
class AWSCodeCommitUpdatePullRequestDescriptionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest, com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionResult> {

	var pullRequestId: String? = null
	var description: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest {
		val input = com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionRequest()
		input.setPullRequestId(this.pullRequestId)
		input.setDescription(this.description)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionResult {
	  return com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.UpdatePullRequestDescriptionResult {
		return environment.codecommit.updatePullRequestDescription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit update-pull-request-description")
				.argument("pull-request-id", pullRequestId)
				.argument("description", description)
	}

}


fun AWSCodeCommitFunctions.updatePullRequestStatus(init: AWSCodeCommitUpdatePullRequestStatusCommand.() -> Unit): com.amazonaws.services.codecommit.model.UpdatePullRequestStatusResult {
	return this.block.declare(AWSCodeCommitUpdatePullRequestStatusCommand().apply(init)) as com.amazonaws.services.codecommit.model.UpdatePullRequestStatusResult
}

@Generated
class AWSCodeCommitUpdatePullRequestStatusCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest, com.amazonaws.services.codecommit.model.UpdatePullRequestStatusResult> {

	var pullRequestId: String? = null
	var pullRequestStatus: PullRequestStatusEnum? = null

	override fun build(): com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest {
		val input = com.amazonaws.services.codecommit.model.UpdatePullRequestStatusRequest()
		input.setPullRequestId(this.pullRequestId)
		input.setPullRequestStatus(this.pullRequestStatus?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.UpdatePullRequestStatusResult {
	  return com.amazonaws.services.codecommit.model.UpdatePullRequestStatusResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.UpdatePullRequestStatusResult {
		return environment.codecommit.updatePullRequestStatus(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit update-pull-request-status")
				.argument("pull-request-id", pullRequestId)
				.argument("pull-request-status", pullRequestStatus?.toString())
	}

}


fun AWSCodeCommitFunctions.updatePullRequestTitle(init: AWSCodeCommitUpdatePullRequestTitleCommand.() -> Unit): com.amazonaws.services.codecommit.model.UpdatePullRequestTitleResult {
	return this.block.declare(AWSCodeCommitUpdatePullRequestTitleCommand().apply(init)) as com.amazonaws.services.codecommit.model.UpdatePullRequestTitleResult
}

@Generated
class AWSCodeCommitUpdatePullRequestTitleCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest, com.amazonaws.services.codecommit.model.UpdatePullRequestTitleResult> {

	var pullRequestId: String? = null
	var title: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest {
		val input = com.amazonaws.services.codecommit.model.UpdatePullRequestTitleRequest()
		input.setPullRequestId(this.pullRequestId)
		input.setTitle(this.title)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.UpdatePullRequestTitleResult {
	  return com.amazonaws.services.codecommit.model.UpdatePullRequestTitleResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.UpdatePullRequestTitleResult {
		return environment.codecommit.updatePullRequestTitle(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit update-pull-request-title")
				.argument("pull-request-id", pullRequestId)
				.argument("title", title)
	}

}


fun AWSCodeCommitFunctions.updateRepositoryDescription(init: AWSCodeCommitUpdateRepositoryDescriptionCommand.() -> Unit): com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionResult {
	return this.block.declare(AWSCodeCommitUpdateRepositoryDescriptionCommand().apply(init)) as com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionResult
}

@Generated
class AWSCodeCommitUpdateRepositoryDescriptionCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest, com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionResult> {

	var repositoryName: String? = null
	var repositoryDescription: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest {
		val input = com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionRequest()
		input.setRepositoryName(this.repositoryName)
		input.setRepositoryDescription(this.repositoryDescription)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionResult {
	  return com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.UpdateRepositoryDescriptionResult {
		return environment.codecommit.updateRepositoryDescription(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit update-repository-description")
				.argument("repository-name", repositoryName)
				.argument("repository-description", repositoryDescription)
	}

}


fun AWSCodeCommitFunctions.updateRepositoryName(init: AWSCodeCommitUpdateRepositoryNameCommand.() -> Unit): com.amazonaws.services.codecommit.model.UpdateRepositoryNameResult {
	return this.block.declare(AWSCodeCommitUpdateRepositoryNameCommand().apply(init)) as com.amazonaws.services.codecommit.model.UpdateRepositoryNameResult
}

@Generated
class AWSCodeCommitUpdateRepositoryNameCommand() : AmazonWebServiceCommand<com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest, com.amazonaws.services.codecommit.model.UpdateRepositoryNameResult> {

	var oldName: String? = null
	var newName: String? = null

	override fun build(): com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest {
		val input = com.amazonaws.services.codecommit.model.UpdateRepositoryNameRequest()
		input.setOldName(this.oldName)
		input.setNewName(this.newName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.codecommit.model.UpdateRepositoryNameResult {
	  return com.amazonaws.services.codecommit.model.UpdateRepositoryNameResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.codecommit.model.UpdateRepositoryNameResult {
		return environment.codecommit.updateRepositoryName(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws codecommit update-repository-name")
				.argument("old-name", oldName)
				.argument("new-name", newName)
	}

}
