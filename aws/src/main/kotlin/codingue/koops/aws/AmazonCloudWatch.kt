
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax", "USELESS_ELVIS")

package codingue.koops.aws

import javax.annotation.Generated
import codingue.koops.core.*
import com.amazonaws.services.cloudwatch.*
import com.amazonaws.services.cloudwatch.model.*

var codingue.koops.core.Environment.monitoring: AmazonCloudWatch
	get() {
		var service = this.capabilities["aws-monitoring"]
		if (service == null) {
			service = AmazonCloudWatchClientBuilder.standard().build()
			this.capabilities["aws-monitoring"] = service
		}
		return service as AmazonCloudWatch
	}
	set(monitoring) {
		this.capabilities["aws-monitoring"] = monitoring
	}

@Generated
class AmazonCloudWatchFunctions(val block: Block)

infix fun <T> AwsContinuation.monitoring(init: AmazonCloudWatchFunctions.() -> T): T {
	return AmazonCloudWatchFunctions(shell).run(init)
}

			

fun AmazonCloudWatchFunctions.deleteAlarms(alarmNames: List<String>, init: AmazonCloudWatchDeleteAlarmsCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult {
	return this.block.declare(AmazonCloudWatchDeleteAlarmsCommand(alarmNames).apply(init)) as com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult
}

@Generated
class AmazonCloudWatchDeleteAlarmsCommand(val alarmNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest, com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult> {



	override fun build(): com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest {
		val input = com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest()
		input.setAlarmNames(this.alarmNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult {
	  return com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult {
		return environment.monitoring.deleteAlarms(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring delete-alarms")
				.argument("alarm-names", alarmNames.toString())
	}

}


fun AmazonCloudWatchFunctions.deleteDashboards(dashboardNames: List<String>, init: AmazonCloudWatchDeleteDashboardsCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult {
	return this.block.declare(AmazonCloudWatchDeleteDashboardsCommand(dashboardNames).apply(init)) as com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult
}

@Generated
class AmazonCloudWatchDeleteDashboardsCommand(val dashboardNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest, com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult> {



	override fun build(): com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest {
		val input = com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest()
		input.setDashboardNames(this.dashboardNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult {
	  return com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult {
		return environment.monitoring.deleteDashboards(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring delete-dashboards")
				.argument("dashboard-names", dashboardNames.toString())
	}

}


fun AmazonCloudWatchFunctions.describeAlarmHistory(init: AmazonCloudWatchDescribeAlarmHistoryCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult {
	return this.block.declare(AmazonCloudWatchDescribeAlarmHistoryCommand().apply(init)) as com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult
}

@Generated
class AmazonCloudWatchDescribeAlarmHistoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest, com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult> {

	var alarmName: String? = null
	var historyItemType: HistoryItemType? = null
	var startDate: java.util.Date? = null
	var endDate: java.util.Date? = null
	var maxRecords: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest {
		val input = com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest()
		input.setAlarmName(this.alarmName)
		input.setHistoryItemType(this.historyItemType?.toString())
		input.setStartDate(this.startDate)
		input.setEndDate(this.endDate)
		input.setMaxRecords(this.maxRecords)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult {
	  return com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult {
		return environment.monitoring.describeAlarmHistory(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring describe-alarm-history")
				.argument("alarm-name", alarmName)
				.argument("history-item-type", historyItemType?.toString())
				.argument("start-date", startDate?.toString())
				.argument("end-date", endDate?.toString())
				.argument("max-records", maxRecords?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudWatchFunctions.describeAlarms(init: AmazonCloudWatchDescribeAlarmsCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult {
	return this.block.declare(AmazonCloudWatchDescribeAlarmsCommand().apply(init)) as com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult
}

@Generated
class AmazonCloudWatchDescribeAlarmsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest, com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult> {

	var alarmNames: List<String>? = null
	var alarmNamePrefix: String? = null
	var stateValue: StateValue? = null
	var actionPrefix: String? = null
	var maxRecords: Int? = 0
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest {
		val input = com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest()
		input.setAlarmNames(this.alarmNames)
		input.setAlarmNamePrefix(this.alarmNamePrefix)
		input.setStateValue(this.stateValue?.toString())
		input.setActionPrefix(this.actionPrefix)
		input.setMaxRecords(this.maxRecords)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult {
	  return com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult {
		return environment.monitoring.describeAlarms(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring describe-alarms")
				.argument("alarm-names", alarmNames?.toString())
				.argument("alarm-name-prefix", alarmNamePrefix)
				.argument("state-value", stateValue?.toString())
				.argument("action-prefix", actionPrefix)
				.argument("max-records", maxRecords?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudWatchFunctions.describeAlarmsForMetric(metricName: String, namespace: String, init: AmazonCloudWatchDescribeAlarmsForMetricCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult {
	return this.block.declare(AmazonCloudWatchDescribeAlarmsForMetricCommand(metricName, namespace).apply(init)) as com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult
}

@Generated
class AmazonCloudWatchDescribeAlarmsForMetricCommand(val metricName: String, val namespace: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest, com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult> {

	var statistic: Statistic? = null
	var extendedStatistic: String? = null
	var dimensions: List<com.amazonaws.services.cloudwatch.model.Dimension>? = null
	var period: Int? = 0
	var unit: StandardUnit? = null

	override fun build(): com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest {
		val input = com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest()
		input.setMetricName(this.metricName)
		input.setNamespace(this.namespace)
		input.setStatistic(this.statistic?.toString())
		input.setExtendedStatistic(this.extendedStatistic)
		input.setDimensions(this.dimensions)
		input.setPeriod(this.period)
		input.setUnit(this.unit?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult {
	  return com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult {
		return environment.monitoring.describeAlarmsForMetric(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring describe-alarms-for-metric")
				.argument("metric-name", metricName)
				.argument("namespace", namespace)
				.argument("statistic", statistic?.toString())
				.argument("extended-statistic", extendedStatistic)
				.argument("dimensions", dimensions?.toString())
				.argument("period", period?.toString())
				.argument("unit", unit?.toString())
	}

}


fun AmazonCloudWatchFunctions.disableAlarmActions(alarmNames: List<String>, init: AmazonCloudWatchDisableAlarmActionsCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult {
	return this.block.declare(AmazonCloudWatchDisableAlarmActionsCommand(alarmNames).apply(init)) as com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult
}

@Generated
class AmazonCloudWatchDisableAlarmActionsCommand(val alarmNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest, com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult> {



	override fun build(): com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest {
		val input = com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest()
		input.setAlarmNames(this.alarmNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult {
	  return com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult {
		return environment.monitoring.disableAlarmActions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring disable-alarm-actions")
				.argument("alarm-names", alarmNames.toString())
	}

}


fun AmazonCloudWatchFunctions.enableAlarmActions(alarmNames: List<String>, init: AmazonCloudWatchEnableAlarmActionsCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult {
	return this.block.declare(AmazonCloudWatchEnableAlarmActionsCommand(alarmNames).apply(init)) as com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult
}

@Generated
class AmazonCloudWatchEnableAlarmActionsCommand(val alarmNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest, com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult> {



	override fun build(): com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest {
		val input = com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest()
		input.setAlarmNames(this.alarmNames)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult {
	  return com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult {
		return environment.monitoring.enableAlarmActions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring enable-alarm-actions")
				.argument("alarm-names", alarmNames.toString())
	}

}


fun AmazonCloudWatchFunctions.getDashboard(dashboardName: String, init: AmazonCloudWatchGetDashboardCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.GetDashboardResult {
	return this.block.declare(AmazonCloudWatchGetDashboardCommand(dashboardName).apply(init)) as com.amazonaws.services.cloudwatch.model.GetDashboardResult
}

@Generated
class AmazonCloudWatchGetDashboardCommand(val dashboardName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.GetDashboardRequest, com.amazonaws.services.cloudwatch.model.GetDashboardResult> {



	override fun build(): com.amazonaws.services.cloudwatch.model.GetDashboardRequest {
		val input = com.amazonaws.services.cloudwatch.model.GetDashboardRequest()
		input.setDashboardName(this.dashboardName)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.GetDashboardResult {
	  return com.amazonaws.services.cloudwatch.model.GetDashboardResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.GetDashboardResult {
		return environment.monitoring.getDashboard(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring get-dashboard")
				.argument("dashboard-name", dashboardName)
	}

}


fun AmazonCloudWatchFunctions.getMetricData(metricDataQueries: List<com.amazonaws.services.cloudwatch.model.MetricDataQuery>, startTime: java.util.Date, endTime: java.util.Date, init: AmazonCloudWatchGetMetricDataCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.GetMetricDataResult {
	return this.block.declare(AmazonCloudWatchGetMetricDataCommand(metricDataQueries, startTime, endTime).apply(init)) as com.amazonaws.services.cloudwatch.model.GetMetricDataResult
}

@Generated
class AmazonCloudWatchGetMetricDataCommand(val metricDataQueries: List<com.amazonaws.services.cloudwatch.model.MetricDataQuery>, val startTime: java.util.Date, val endTime: java.util.Date) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.GetMetricDataRequest, com.amazonaws.services.cloudwatch.model.GetMetricDataResult> {

	var nextToken: String? = null
	var scanBy: ScanBy? = null
	var maxDatapoints: Int? = 0

	override fun build(): com.amazonaws.services.cloudwatch.model.GetMetricDataRequest {
		val input = com.amazonaws.services.cloudwatch.model.GetMetricDataRequest()
		input.setMetricDataQueries(this.metricDataQueries)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setNextToken(this.nextToken)
		input.setScanBy(this.scanBy?.toString())
		input.setMaxDatapoints(this.maxDatapoints)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.GetMetricDataResult {
	  return com.amazonaws.services.cloudwatch.model.GetMetricDataResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.GetMetricDataResult {
		return environment.monitoring.getMetricData(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring get-metric-data")
				.argument("metric-data-queries", metricDataQueries.toString())
				.argument("start-time", startTime.toString())
				.argument("end-time", endTime.toString())
				.argument("next-token", nextToken)
				.argument("scan-by", scanBy?.toString())
				.argument("max-datapoints", maxDatapoints?.toString())
	}

}


fun AmazonCloudWatchFunctions.getMetricStatistics(namespace: String, metricName: String, startTime: java.util.Date, endTime: java.util.Date, period: Int, init: AmazonCloudWatchGetMetricStatisticsCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult {
	return this.block.declare(AmazonCloudWatchGetMetricStatisticsCommand(namespace, metricName, startTime, endTime, period).apply(init)) as com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult
}

@Generated
class AmazonCloudWatchGetMetricStatisticsCommand(val namespace: String, val metricName: String, val startTime: java.util.Date, val endTime: java.util.Date, val period: Int) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest, com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult> {

	var dimensions: List<com.amazonaws.services.cloudwatch.model.Dimension>? = null
	var statistics: List<Statistic>? = null
	var extendedStatistics: List<String>? = null
	var unit: StandardUnit? = null

	override fun build(): com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest {
		val input = com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest()
		input.setNamespace(this.namespace)
		input.setMetricName(this.metricName)
		input.setDimensions(this.dimensions)
		input.setStartTime(this.startTime)
		input.setEndTime(this.endTime)
		input.setPeriod(this.period)
		input.setStatistics(this.statistics?.map { it.toString() })
		input.setExtendedStatistics(this.extendedStatistics)
		input.setUnit(this.unit?.toString())
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult {
	  return com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult {
		return environment.monitoring.getMetricStatistics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring get-metric-statistics")
				.argument("namespace", namespace)
				.argument("metric-name", metricName)
				.argument("dimensions", dimensions?.toString())
				.argument("start-time", startTime.toString())
				.argument("end-time", endTime.toString())
				.argument("period", period.toString())
				.argument("statistics", statistics?.toString())
				.argument("extended-statistics", extendedStatistics?.toString())
				.argument("unit", unit?.toString())
	}

}


fun AmazonCloudWatchFunctions.listDashboards(init: AmazonCloudWatchListDashboardsCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.ListDashboardsResult {
	return this.block.declare(AmazonCloudWatchListDashboardsCommand().apply(init)) as com.amazonaws.services.cloudwatch.model.ListDashboardsResult
}

@Generated
class AmazonCloudWatchListDashboardsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.ListDashboardsRequest, com.amazonaws.services.cloudwatch.model.ListDashboardsResult> {

	var dashboardNamePrefix: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudwatch.model.ListDashboardsRequest {
		val input = com.amazonaws.services.cloudwatch.model.ListDashboardsRequest()
		input.setDashboardNamePrefix(this.dashboardNamePrefix)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.ListDashboardsResult {
	  return com.amazonaws.services.cloudwatch.model.ListDashboardsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.ListDashboardsResult {
		return environment.monitoring.listDashboards(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring list-dashboards")
				.argument("dashboard-name-prefix", dashboardNamePrefix)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudWatchFunctions.listMetrics(init: AmazonCloudWatchListMetricsCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.ListMetricsResult {
	return this.block.declare(AmazonCloudWatchListMetricsCommand().apply(init)) as com.amazonaws.services.cloudwatch.model.ListMetricsResult
}

@Generated
class AmazonCloudWatchListMetricsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.ListMetricsRequest, com.amazonaws.services.cloudwatch.model.ListMetricsResult> {

	var namespace: String? = null
	var metricName: String? = null
	var dimensions: List<com.amazonaws.services.cloudwatch.model.DimensionFilter>? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudwatch.model.ListMetricsRequest {
		val input = com.amazonaws.services.cloudwatch.model.ListMetricsRequest()
		input.setNamespace(this.namespace)
		input.setMetricName(this.metricName)
		input.setDimensions(this.dimensions)
		input.setNextToken(this.nextToken)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.ListMetricsResult {
	  return com.amazonaws.services.cloudwatch.model.ListMetricsResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.ListMetricsResult {
		return environment.monitoring.listMetrics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring list-metrics")
				.argument("namespace", namespace)
				.argument("metric-name", metricName)
				.argument("dimensions", dimensions?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudWatchFunctions.putDashboard(dashboardName: String, dashboardBody: String, init: AmazonCloudWatchPutDashboardCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.PutDashboardResult {
	return this.block.declare(AmazonCloudWatchPutDashboardCommand(dashboardName, dashboardBody).apply(init)) as com.amazonaws.services.cloudwatch.model.PutDashboardResult
}

@Generated
class AmazonCloudWatchPutDashboardCommand(val dashboardName: String, val dashboardBody: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.PutDashboardRequest, com.amazonaws.services.cloudwatch.model.PutDashboardResult> {



	override fun build(): com.amazonaws.services.cloudwatch.model.PutDashboardRequest {
		val input = com.amazonaws.services.cloudwatch.model.PutDashboardRequest()
		input.setDashboardName(this.dashboardName)
		input.setDashboardBody(this.dashboardBody)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.PutDashboardResult {
	  return com.amazonaws.services.cloudwatch.model.PutDashboardResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.PutDashboardResult {
		return environment.monitoring.putDashboard(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring put-dashboard")
				.argument("dashboard-name", dashboardName)
				.argument("dashboard-body", dashboardBody)
	}

}


fun AmazonCloudWatchFunctions.putMetricAlarm(alarmName: String, metricName: String, namespace: String, period: Int, evaluationPeriods: Int, threshold: Double, comparisonOperator: ComparisonOperator, init: AmazonCloudWatchPutMetricAlarmCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult {
	return this.block.declare(AmazonCloudWatchPutMetricAlarmCommand(alarmName, metricName, namespace, period, evaluationPeriods, threshold, comparisonOperator).apply(init)) as com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult
}

@Generated
class AmazonCloudWatchPutMetricAlarmCommand(val alarmName: String, val metricName: String, val namespace: String, val period: Int, val evaluationPeriods: Int, val threshold: Double, val comparisonOperator: ComparisonOperator) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest, com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult> {

	var alarmDescription: String? = null
	var actionsEnabled: Boolean? = false
	var oKActions: List<String>? = null
	var alarmActions: List<String>? = null
	var insufficientDataActions: List<String>? = null
	var statistic: Statistic? = null
	var extendedStatistic: String? = null
	var dimensions: List<com.amazonaws.services.cloudwatch.model.Dimension>? = null
	var unit: StandardUnit? = null
	var datapointsToAlarm: Int? = 0
	var treatMissingData: String? = null
	var evaluateLowSampleCountPercentile: String? = null

	override fun build(): com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest {
		val input = com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest()
		input.setAlarmName(this.alarmName)
		input.setAlarmDescription(this.alarmDescription)
		input.setActionsEnabled(this.actionsEnabled)
		input.setOKActions(this.oKActions)
		input.setAlarmActions(this.alarmActions)
		input.setInsufficientDataActions(this.insufficientDataActions)
		input.setMetricName(this.metricName)
		input.setNamespace(this.namespace)
		input.setStatistic(this.statistic?.toString())
		input.setExtendedStatistic(this.extendedStatistic)
		input.setDimensions(this.dimensions)
		input.setPeriod(this.period)
		input.setUnit(this.unit?.toString())
		input.setEvaluationPeriods(this.evaluationPeriods)
		input.setDatapointsToAlarm(this.datapointsToAlarm)
		input.setThreshold(this.threshold)
		input.setComparisonOperator(this.comparisonOperator.toString())
		input.setTreatMissingData(this.treatMissingData)
		input.setEvaluateLowSampleCountPercentile(this.evaluateLowSampleCountPercentile)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult {
	  return com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult {
		return environment.monitoring.putMetricAlarm(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring put-metric-alarm")
				.argument("alarm-name", alarmName)
				.argument("alarm-description", alarmDescription)
				.option("actions-enabled", actionsEnabled ?: false)
				.argument("okactions", oKActions?.toString())
				.argument("alarm-actions", alarmActions?.toString())
				.argument("insufficient-data-actions", insufficientDataActions?.toString())
				.argument("metric-name", metricName)
				.argument("namespace", namespace)
				.argument("statistic", statistic?.toString())
				.argument("extended-statistic", extendedStatistic)
				.argument("dimensions", dimensions?.toString())
				.argument("period", period.toString())
				.argument("unit", unit?.toString())
				.argument("evaluation-periods", evaluationPeriods.toString())
				.argument("datapoints-to-alarm", datapointsToAlarm?.toString())
				.argument("threshold", threshold.toString())
				.argument("comparison-operator", comparisonOperator.toString())
				.argument("treat-missing-data", treatMissingData)
				.argument("evaluate-low-sample-count-percentile", evaluateLowSampleCountPercentile)
	}

}


fun AmazonCloudWatchFunctions.putMetricData(namespace: String, metricData: List<com.amazonaws.services.cloudwatch.model.MetricDatum>, init: AmazonCloudWatchPutMetricDataCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.PutMetricDataResult {
	return this.block.declare(AmazonCloudWatchPutMetricDataCommand(namespace, metricData).apply(init)) as com.amazonaws.services.cloudwatch.model.PutMetricDataResult
}

@Generated
class AmazonCloudWatchPutMetricDataCommand(val namespace: String, val metricData: List<com.amazonaws.services.cloudwatch.model.MetricDatum>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.PutMetricDataRequest, com.amazonaws.services.cloudwatch.model.PutMetricDataResult> {



	override fun build(): com.amazonaws.services.cloudwatch.model.PutMetricDataRequest {
		val input = com.amazonaws.services.cloudwatch.model.PutMetricDataRequest()
		input.setNamespace(this.namespace)
		input.setMetricData(this.metricData)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.PutMetricDataResult {
	  return com.amazonaws.services.cloudwatch.model.PutMetricDataResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.PutMetricDataResult {
		return environment.monitoring.putMetricData(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring put-metric-data")
				.argument("namespace", namespace)
				.argument("metric-data", metricData.toString())
	}

}


fun AmazonCloudWatchFunctions.setAlarmState(alarmName: String, stateValue: StateValue, stateReason: String, init: AmazonCloudWatchSetAlarmStateCommand.() -> Unit): com.amazonaws.services.cloudwatch.model.SetAlarmStateResult {
	return this.block.declare(AmazonCloudWatchSetAlarmStateCommand(alarmName, stateValue, stateReason).apply(init)) as com.amazonaws.services.cloudwatch.model.SetAlarmStateResult
}

@Generated
class AmazonCloudWatchSetAlarmStateCommand(val alarmName: String, val stateValue: StateValue, val stateReason: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest, com.amazonaws.services.cloudwatch.model.SetAlarmStateResult> {

	var stateReasonData: String? = null

	override fun build(): com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest {
		val input = com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest()
		input.setAlarmName(this.alarmName)
		input.setStateValue(this.stateValue.toString())
		input.setStateReason(this.stateReason)
		input.setStateReasonData(this.stateReasonData)
		return input
	}

	
	override fun dryResult(): com.amazonaws.services.cloudwatch.model.SetAlarmStateResult {
	  return com.amazonaws.services.cloudwatch.model.SetAlarmStateResult()
	}


	override fun eval(environment: codingue.koops.core.Environment): com.amazonaws.services.cloudwatch.model.SetAlarmStateResult {
		return environment.monitoring.setAlarmState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring set-alarm-state")
				.argument("alarm-name", alarmName)
				.argument("state-value", stateValue.toString())
				.argument("state-reason", stateReason)
				.argument("state-reason-data", stateReasonData)
	}

}
