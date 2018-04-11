
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceVoidCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.budgets.AWSBudgets
import com.amazonaws.services.budgets.AWSBudgetsClientBuilder
import com.amazonaws.services.budgets.model.*

var codingue.koops.core.Environment.budgets: AWSBudgets
	get() {
		var service = this.capabilities[AWSBudgets::class.java.name]
		if (service == null) {
			service = AWSBudgetsClientBuilder.standard().build()
			budgets = service
		}
		return service as AWSBudgets
	}
	set(budgets) {
		this.capabilities[AWSBudgets::class.java.name] = budgets
	}

@Generated
class AWSBudgetsFunctions(val block: Block)

infix fun <T> AwsContinuation.budgets(init: AWSBudgetsFunctions.() -> T): T {
	return AWSBudgetsFunctions(shell).run(init)
}

			

fun AWSBudgetsFunctions.createBudget(accountId: String, budget: com.amazonaws.services.budgets.model.Budget, init: AWSBudgetsCreateBudgetCommand.() -> Unit): com.amazonaws.services.budgets.model.CreateBudgetResult {
	return this.block.declare(AWSBudgetsCreateBudgetCommand(accountId, budget).apply(init)) as com.amazonaws.services.budgets.model.CreateBudgetResult
}

@Generated
class AWSBudgetsCreateBudgetCommand(val accountId: String, val budget: com.amazonaws.services.budgets.model.Budget) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.CreateBudgetRequest, com.amazonaws.services.budgets.model.CreateBudgetResult> {

	var notificationsWithSubscribers: List<com.amazonaws.services.budgets.model.NotificationWithSubscribers>? = null

	override fun build(): com.amazonaws.services.budgets.model.CreateBudgetRequest {
		val input = com.amazonaws.services.budgets.model.CreateBudgetRequest()
		input.setAccountId(this.accountId)
		input.setBudget(this.budget)
		input.setNotificationsWithSubscribers(this.notificationsWithSubscribers)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.CreateBudgetResult {
	  return com.amazonaws.services.budgets.model.CreateBudgetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.CreateBudgetResult {
		return environment.budgets.createBudget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets create-budget")
				.argument("account-id", accountId)
				.argument("budget", budget.toString())
				.argument("notifications-with-subscribers", notificationsWithSubscribers?.toString())
	}

}


fun AWSBudgetsFunctions.createNotification(accountId: String, budgetName: String, notification: com.amazonaws.services.budgets.model.Notification, subscribers: List<com.amazonaws.services.budgets.model.Subscriber>, init: AWSBudgetsCreateNotificationCommand.() -> Unit): com.amazonaws.services.budgets.model.CreateNotificationResult {
	return this.block.declare(AWSBudgetsCreateNotificationCommand(accountId, budgetName, notification, subscribers).apply(init)) as com.amazonaws.services.budgets.model.CreateNotificationResult
}

@Generated
class AWSBudgetsCreateNotificationCommand(val accountId: String, val budgetName: String, val notification: com.amazonaws.services.budgets.model.Notification, val subscribers: List<com.amazonaws.services.budgets.model.Subscriber>) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.CreateNotificationRequest, com.amazonaws.services.budgets.model.CreateNotificationResult> {



	override fun build(): com.amazonaws.services.budgets.model.CreateNotificationRequest {
		val input = com.amazonaws.services.budgets.model.CreateNotificationRequest()
		input.setAccountId(this.accountId)
		input.setBudgetName(this.budgetName)
		input.setNotification(this.notification)
		input.setSubscribers(this.subscribers)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.CreateNotificationResult {
	  return com.amazonaws.services.budgets.model.CreateNotificationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.CreateNotificationResult {
		return environment.budgets.createNotification(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets create-notification")
				.argument("account-id", accountId)
				.argument("budget-name", budgetName)
				.argument("notification", notification.toString())
				.argument("subscribers", subscribers.toString())
	}

}


fun AWSBudgetsFunctions.createSubscriber(accountId: String, budgetName: String, notification: com.amazonaws.services.budgets.model.Notification, subscriber: com.amazonaws.services.budgets.model.Subscriber, init: AWSBudgetsCreateSubscriberCommand.() -> Unit): com.amazonaws.services.budgets.model.CreateSubscriberResult {
	return this.block.declare(AWSBudgetsCreateSubscriberCommand(accountId, budgetName, notification, subscriber).apply(init)) as com.amazonaws.services.budgets.model.CreateSubscriberResult
}

@Generated
class AWSBudgetsCreateSubscriberCommand(val accountId: String, val budgetName: String, val notification: com.amazonaws.services.budgets.model.Notification, val subscriber: com.amazonaws.services.budgets.model.Subscriber) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.CreateSubscriberRequest, com.amazonaws.services.budgets.model.CreateSubscriberResult> {



	override fun build(): com.amazonaws.services.budgets.model.CreateSubscriberRequest {
		val input = com.amazonaws.services.budgets.model.CreateSubscriberRequest()
		input.setAccountId(this.accountId)
		input.setBudgetName(this.budgetName)
		input.setNotification(this.notification)
		input.setSubscriber(this.subscriber)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.CreateSubscriberResult {
	  return com.amazonaws.services.budgets.model.CreateSubscriberResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.CreateSubscriberResult {
		return environment.budgets.createSubscriber(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets create-subscriber")
				.argument("account-id", accountId)
				.argument("budget-name", budgetName)
				.argument("notification", notification.toString())
				.argument("subscriber", subscriber.toString())
	}

}


fun AWSBudgetsFunctions.deleteBudget(accountId: String, budgetName: String, init: AWSBudgetsDeleteBudgetCommand.() -> Unit): com.amazonaws.services.budgets.model.DeleteBudgetResult {
	return this.block.declare(AWSBudgetsDeleteBudgetCommand(accountId, budgetName).apply(init)) as com.amazonaws.services.budgets.model.DeleteBudgetResult
}

@Generated
class AWSBudgetsDeleteBudgetCommand(val accountId: String, val budgetName: String) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.DeleteBudgetRequest, com.amazonaws.services.budgets.model.DeleteBudgetResult> {



	override fun build(): com.amazonaws.services.budgets.model.DeleteBudgetRequest {
		val input = com.amazonaws.services.budgets.model.DeleteBudgetRequest()
		input.setAccountId(this.accountId)
		input.setBudgetName(this.budgetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.DeleteBudgetResult {
	  return com.amazonaws.services.budgets.model.DeleteBudgetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.DeleteBudgetResult {
		return environment.budgets.deleteBudget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets delete-budget")
				.argument("account-id", accountId)
				.argument("budget-name", budgetName)
	}

}


fun AWSBudgetsFunctions.deleteNotification(accountId: String, budgetName: String, notification: com.amazonaws.services.budgets.model.Notification, init: AWSBudgetsDeleteNotificationCommand.() -> Unit): com.amazonaws.services.budgets.model.DeleteNotificationResult {
	return this.block.declare(AWSBudgetsDeleteNotificationCommand(accountId, budgetName, notification).apply(init)) as com.amazonaws.services.budgets.model.DeleteNotificationResult
}

@Generated
class AWSBudgetsDeleteNotificationCommand(val accountId: String, val budgetName: String, val notification: com.amazonaws.services.budgets.model.Notification) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.DeleteNotificationRequest, com.amazonaws.services.budgets.model.DeleteNotificationResult> {



	override fun build(): com.amazonaws.services.budgets.model.DeleteNotificationRequest {
		val input = com.amazonaws.services.budgets.model.DeleteNotificationRequest()
		input.setAccountId(this.accountId)
		input.setBudgetName(this.budgetName)
		input.setNotification(this.notification)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.DeleteNotificationResult {
	  return com.amazonaws.services.budgets.model.DeleteNotificationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.DeleteNotificationResult {
		return environment.budgets.deleteNotification(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets delete-notification")
				.argument("account-id", accountId)
				.argument("budget-name", budgetName)
				.argument("notification", notification.toString())
	}

}


fun AWSBudgetsFunctions.deleteSubscriber(accountId: String, budgetName: String, notification: com.amazonaws.services.budgets.model.Notification, subscriber: com.amazonaws.services.budgets.model.Subscriber, init: AWSBudgetsDeleteSubscriberCommand.() -> Unit): com.amazonaws.services.budgets.model.DeleteSubscriberResult {
	return this.block.declare(AWSBudgetsDeleteSubscriberCommand(accountId, budgetName, notification, subscriber).apply(init)) as com.amazonaws.services.budgets.model.DeleteSubscriberResult
}

@Generated
class AWSBudgetsDeleteSubscriberCommand(val accountId: String, val budgetName: String, val notification: com.amazonaws.services.budgets.model.Notification, val subscriber: com.amazonaws.services.budgets.model.Subscriber) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.DeleteSubscriberRequest, com.amazonaws.services.budgets.model.DeleteSubscriberResult> {



	override fun build(): com.amazonaws.services.budgets.model.DeleteSubscriberRequest {
		val input = com.amazonaws.services.budgets.model.DeleteSubscriberRequest()
		input.setAccountId(this.accountId)
		input.setBudgetName(this.budgetName)
		input.setNotification(this.notification)
		input.setSubscriber(this.subscriber)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.DeleteSubscriberResult {
	  return com.amazonaws.services.budgets.model.DeleteSubscriberResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.DeleteSubscriberResult {
		return environment.budgets.deleteSubscriber(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets delete-subscriber")
				.argument("account-id", accountId)
				.argument("budget-name", budgetName)
				.argument("notification", notification.toString())
				.argument("subscriber", subscriber.toString())
	}

}


fun AWSBudgetsFunctions.describeBudget(accountId: String, budgetName: String, init: AWSBudgetsDescribeBudgetCommand.() -> Unit): com.amazonaws.services.budgets.model.DescribeBudgetResult {
	return this.block.declare(AWSBudgetsDescribeBudgetCommand(accountId, budgetName).apply(init)) as com.amazonaws.services.budgets.model.DescribeBudgetResult
}

@Generated
class AWSBudgetsDescribeBudgetCommand(val accountId: String, val budgetName: String) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.DescribeBudgetRequest, com.amazonaws.services.budgets.model.DescribeBudgetResult> {



	override fun build(): com.amazonaws.services.budgets.model.DescribeBudgetRequest {
		val input = com.amazonaws.services.budgets.model.DescribeBudgetRequest()
		input.setAccountId(this.accountId)
		input.setBudgetName(this.budgetName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.DescribeBudgetResult {
	  return com.amazonaws.services.budgets.model.DescribeBudgetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.DescribeBudgetResult {
		return environment.budgets.describeBudget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets describe-budget")
				.argument("account-id", accountId)
				.argument("budget-name", budgetName)
	}

}


fun AWSBudgetsFunctions.describeBudgets(accountId: String, init: AWSBudgetsDescribeBudgetsCommand.() -> Unit): com.amazonaws.services.budgets.model.DescribeBudgetsResult {
	return this.block.declare(AWSBudgetsDescribeBudgetsCommand(accountId).apply(init)) as com.amazonaws.services.budgets.model.DescribeBudgetsResult
}

@Generated
class AWSBudgetsDescribeBudgetsCommand(val accountId: String) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.DescribeBudgetsRequest, com.amazonaws.services.budgets.model.DescribeBudgetsResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.budgets.model.DescribeBudgetsRequest {
		val input = com.amazonaws.services.budgets.model.DescribeBudgetsRequest()
		input.setAccountId(this.accountId)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.DescribeBudgetsResult {
	  return com.amazonaws.services.budgets.model.DescribeBudgetsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.DescribeBudgetsResult {
		return environment.budgets.describeBudgets(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets describe-budgets")
				.argument("account-id", accountId)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSBudgetsFunctions.describeNotificationsForBudget(accountId: String, budgetName: String, init: AWSBudgetsDescribeNotificationsForBudgetCommand.() -> Unit): com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult {
	return this.block.declare(AWSBudgetsDescribeNotificationsForBudgetCommand(accountId, budgetName).apply(init)) as com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult
}

@Generated
class AWSBudgetsDescribeNotificationsForBudgetCommand(val accountId: String, val budgetName: String) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest, com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest {
		val input = com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetRequest()
		input.setAccountId(this.accountId)
		input.setBudgetName(this.budgetName)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult {
	  return com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.DescribeNotificationsForBudgetResult {
		return environment.budgets.describeNotificationsForBudget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets describe-notifications-for-budget")
				.argument("account-id", accountId)
				.argument("budget-name", budgetName)
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSBudgetsFunctions.describeSubscribersForNotification(accountId: String, budgetName: String, notification: com.amazonaws.services.budgets.model.Notification, init: AWSBudgetsDescribeSubscribersForNotificationCommand.() -> Unit): com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult {
	return this.block.declare(AWSBudgetsDescribeSubscribersForNotificationCommand(accountId, budgetName, notification).apply(init)) as com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult
}

@Generated
class AWSBudgetsDescribeSubscribersForNotificationCommand(val accountId: String, val budgetName: String, val notification: com.amazonaws.services.budgets.model.Notification) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest, com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult> {

	var maxResults: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest {
		val input = com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationRequest()
		input.setAccountId(this.accountId)
		input.setBudgetName(this.budgetName)
		input.setNotification(this.notification)
		input.setMaxResults(this.maxResults)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult {
	  return com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.DescribeSubscribersForNotificationResult {
		return environment.budgets.describeSubscribersForNotification(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets describe-subscribers-for-notification")
				.argument("account-id", accountId)
				.argument("budget-name", budgetName)
				.argument("notification", notification.toString())
				.argument("max-results", maxResults?.toString())
				.argument("next-token", nextToken)
	}

}


fun AWSBudgetsFunctions.updateBudget(accountId: String, newBudget: com.amazonaws.services.budgets.model.Budget, init: AWSBudgetsUpdateBudgetCommand.() -> Unit): com.amazonaws.services.budgets.model.UpdateBudgetResult {
	return this.block.declare(AWSBudgetsUpdateBudgetCommand(accountId, newBudget).apply(init)) as com.amazonaws.services.budgets.model.UpdateBudgetResult
}

@Generated
class AWSBudgetsUpdateBudgetCommand(val accountId: String, val newBudget: com.amazonaws.services.budgets.model.Budget) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.UpdateBudgetRequest, com.amazonaws.services.budgets.model.UpdateBudgetResult> {



	override fun build(): com.amazonaws.services.budgets.model.UpdateBudgetRequest {
		val input = com.amazonaws.services.budgets.model.UpdateBudgetRequest()
		input.setAccountId(this.accountId)
		input.setNewBudget(this.newBudget)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.UpdateBudgetResult {
	  return com.amazonaws.services.budgets.model.UpdateBudgetResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.UpdateBudgetResult {
		return environment.budgets.updateBudget(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets update-budget")
				.argument("account-id", accountId)
				.argument("new-budget", newBudget.toString())
	}

}


fun AWSBudgetsFunctions.updateNotification(accountId: String, budgetName: String, oldNotification: com.amazonaws.services.budgets.model.Notification, newNotification: com.amazonaws.services.budgets.model.Notification, init: AWSBudgetsUpdateNotificationCommand.() -> Unit): com.amazonaws.services.budgets.model.UpdateNotificationResult {
	return this.block.declare(AWSBudgetsUpdateNotificationCommand(accountId, budgetName, oldNotification, newNotification).apply(init)) as com.amazonaws.services.budgets.model.UpdateNotificationResult
}

@Generated
class AWSBudgetsUpdateNotificationCommand(val accountId: String, val budgetName: String, val oldNotification: com.amazonaws.services.budgets.model.Notification, val newNotification: com.amazonaws.services.budgets.model.Notification) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.UpdateNotificationRequest, com.amazonaws.services.budgets.model.UpdateNotificationResult> {



	override fun build(): com.amazonaws.services.budgets.model.UpdateNotificationRequest {
		val input = com.amazonaws.services.budgets.model.UpdateNotificationRequest()
		input.setAccountId(this.accountId)
		input.setBudgetName(this.budgetName)
		input.setOldNotification(this.oldNotification)
		input.setNewNotification(this.newNotification)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.UpdateNotificationResult {
	  return com.amazonaws.services.budgets.model.UpdateNotificationResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.UpdateNotificationResult {
		return environment.budgets.updateNotification(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets update-notification")
				.argument("account-id", accountId)
				.argument("budget-name", budgetName)
				.argument("old-notification", oldNotification.toString())
				.argument("new-notification", newNotification.toString())
	}

}


fun AWSBudgetsFunctions.updateSubscriber(accountId: String, budgetName: String, notification: com.amazonaws.services.budgets.model.Notification, oldSubscriber: com.amazonaws.services.budgets.model.Subscriber, newSubscriber: com.amazonaws.services.budgets.model.Subscriber, init: AWSBudgetsUpdateSubscriberCommand.() -> Unit): com.amazonaws.services.budgets.model.UpdateSubscriberResult {
	return this.block.declare(AWSBudgetsUpdateSubscriberCommand(accountId, budgetName, notification, oldSubscriber, newSubscriber).apply(init)) as com.amazonaws.services.budgets.model.UpdateSubscriberResult
}

@Generated
class AWSBudgetsUpdateSubscriberCommand(val accountId: String, val budgetName: String, val notification: com.amazonaws.services.budgets.model.Notification, val oldSubscriber: com.amazonaws.services.budgets.model.Subscriber, val newSubscriber: com.amazonaws.services.budgets.model.Subscriber) : AmazonWebServiceCommand<com.amazonaws.services.budgets.model.UpdateSubscriberRequest, com.amazonaws.services.budgets.model.UpdateSubscriberResult> {



	override fun build(): com.amazonaws.services.budgets.model.UpdateSubscriberRequest {
		val input = com.amazonaws.services.budgets.model.UpdateSubscriberRequest()
		input.setAccountId(this.accountId)
		input.setBudgetName(this.budgetName)
		input.setNotification(this.notification)
		input.setOldSubscriber(this.oldSubscriber)
		input.setNewSubscriber(this.newSubscriber)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.budgets.model.UpdateSubscriberResult {
	  return com.amazonaws.services.budgets.model.UpdateSubscriberResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.budgets.model.UpdateSubscriberResult {
		return environment.budgets.updateSubscriber(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws budgets update-subscriber")
				.argument("account-id", accountId)
				.argument("budget-name", budgetName)
				.argument("notification", notification.toString())
				.argument("old-subscriber", oldSubscriber.toString())
				.argument("new-subscriber", newSubscriber.toString())
	}

}
