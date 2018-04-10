
@file:Suppress("unused", "MemberVisibilityCanBePrivate", "DEPRECATION", "RemoveEmptyPrimaryConstructor", "UnnecessaryVariable", "UsePropertyAccessSyntax")

package codingue.koops.core.aws

import javax.annotation.Generated
import codingue.koops.core.AmazonWebServiceCommand
import codingue.koops.core.AmazonWebServiceDescriptor
import codingue.koops.core.AwsContinuation
import codingue.koops.core.Block
import com.amazonaws.services.cloudwatch.AmazonCloudWatch
import com.amazonaws.services.cloudwatch.model.*

var codingue.koops.core.Environment.monitoring: AmazonCloudWatch
	get() = this.capabilities[AmazonCloudWatch::class.java.name] as AmazonCloudWatch
	set(monitoring) {
		this.capabilities[AmazonCloudWatch::class.java.name] = monitoring
	}

@Generated
class AmazonCloudWatchFunctions(val block: Block)

infix fun AwsContinuation.monitoring(init: AmazonCloudWatchFunctions.() -> Unit) {
	AmazonCloudWatchFunctions(shell).apply(init)
}

			

fun AmazonCloudWatchFunctions.deleteAlarms(alarmNames: List<String>, init: AmazonCloudWatchDeleteAlarmsCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchDeleteAlarmsCommand(alarmNames).apply(init))
}

@Generated
class AmazonCloudWatchDeleteAlarmsCommand(val alarmNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest> {



	override fun build(): com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest {
		val input = com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest()
		input.setAlarmNames(this.alarmNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.deleteAlarms(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring delete-alarms")
				.argument("alarm-names", alarmNames.toString())
	}

}


fun AmazonCloudWatchFunctions.deleteDashboards(dashboardNames: List<String>, init: AmazonCloudWatchDeleteDashboardsCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchDeleteDashboardsCommand(dashboardNames).apply(init))
}

@Generated
class AmazonCloudWatchDeleteDashboardsCommand(val dashboardNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest> {



	override fun build(): com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest {
		val input = com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest()
		input.setDashboardNames(this.dashboardNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.deleteDashboards(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring delete-dashboards")
				.argument("dashboard-names", dashboardNames.toString())
	}

}


fun AmazonCloudWatchFunctions.describeAlarmHistory(init: AmazonCloudWatchDescribeAlarmHistoryCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchDescribeAlarmHistoryCommand().apply(init))
}

@Generated
class AmazonCloudWatchDescribeAlarmHistoryCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.describeAlarmHistory(build())
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


fun AmazonCloudWatchFunctions.describeAlarms(init: AmazonCloudWatchDescribeAlarmsCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchDescribeAlarmsCommand().apply(init))
}

@Generated
class AmazonCloudWatchDescribeAlarmsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.describeAlarms(build())
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


fun AmazonCloudWatchFunctions.describeAlarmsForMetric(metricName: String, namespace: String, init: AmazonCloudWatchDescribeAlarmsForMetricCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchDescribeAlarmsForMetricCommand(metricName, namespace).apply(init))
}

@Generated
class AmazonCloudWatchDescribeAlarmsForMetricCommand(val metricName: String, val namespace: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.describeAlarmsForMetric(build())
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


fun AmazonCloudWatchFunctions.disableAlarmActions(alarmNames: List<String>, init: AmazonCloudWatchDisableAlarmActionsCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchDisableAlarmActionsCommand(alarmNames).apply(init))
}

@Generated
class AmazonCloudWatchDisableAlarmActionsCommand(val alarmNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest> {



	override fun build(): com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest {
		val input = com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest()
		input.setAlarmNames(this.alarmNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.disableAlarmActions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring disable-alarm-actions")
				.argument("alarm-names", alarmNames.toString())
	}

}


fun AmazonCloudWatchFunctions.enableAlarmActions(alarmNames: List<String>, init: AmazonCloudWatchEnableAlarmActionsCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchEnableAlarmActionsCommand(alarmNames).apply(init))
}

@Generated
class AmazonCloudWatchEnableAlarmActionsCommand(val alarmNames: List<String>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest> {



	override fun build(): com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest {
		val input = com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest()
		input.setAlarmNames(this.alarmNames)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.enableAlarmActions(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring enable-alarm-actions")
				.argument("alarm-names", alarmNames.toString())
	}

}


fun AmazonCloudWatchFunctions.getDashboard(dashboardName: String, init: AmazonCloudWatchGetDashboardCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchGetDashboardCommand(dashboardName).apply(init))
}

@Generated
class AmazonCloudWatchGetDashboardCommand(val dashboardName: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.GetDashboardRequest> {



	override fun build(): com.amazonaws.services.cloudwatch.model.GetDashboardRequest {
		val input = com.amazonaws.services.cloudwatch.model.GetDashboardRequest()
		input.setDashboardName(this.dashboardName)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.getDashboard(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring get-dashboard")
				.argument("dashboard-name", dashboardName)
	}

}


fun AmazonCloudWatchFunctions.getMetricData(metricDataQueries: List<com.amazonaws.services.cloudwatch.model.MetricDataQuery>, startTime: java.util.Date, endTime: java.util.Date, init: AmazonCloudWatchGetMetricDataCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchGetMetricDataCommand(metricDataQueries, startTime, endTime).apply(init))
}

@Generated
class AmazonCloudWatchGetMetricDataCommand(val metricDataQueries: List<com.amazonaws.services.cloudwatch.model.MetricDataQuery>, val startTime: java.util.Date, val endTime: java.util.Date) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.GetMetricDataRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.getMetricData(build())
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


fun AmazonCloudWatchFunctions.getMetricStatistics(namespace: String, metricName: String, startTime: java.util.Date, endTime: java.util.Date, period: Int, init: AmazonCloudWatchGetMetricStatisticsCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchGetMetricStatisticsCommand(namespace, metricName, startTime, endTime, period).apply(init))
}

@Generated
class AmazonCloudWatchGetMetricStatisticsCommand(val namespace: String, val metricName: String, val startTime: java.util.Date, val endTime: java.util.Date, val period: Int) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.getMetricStatistics(build())
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


fun AmazonCloudWatchFunctions.listDashboards(init: AmazonCloudWatchListDashboardsCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchListDashboardsCommand().apply(init))
}

@Generated
class AmazonCloudWatchListDashboardsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.ListDashboardsRequest> {

	var dashboardNamePrefix: String? = null
	var nextToken: String? = null

	override fun build(): com.amazonaws.services.cloudwatch.model.ListDashboardsRequest {
		val input = com.amazonaws.services.cloudwatch.model.ListDashboardsRequest()
		input.setDashboardNamePrefix(this.dashboardNamePrefix)
		input.setNextToken(this.nextToken)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.listDashboards(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring list-dashboards")
				.argument("dashboard-name-prefix", dashboardNamePrefix)
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudWatchFunctions.listMetrics(init: AmazonCloudWatchListMetricsCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchListMetricsCommand().apply(init))
}

@Generated
class AmazonCloudWatchListMetricsCommand() : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.ListMetricsRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.listMetrics(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring list-metrics")
				.argument("namespace", namespace)
				.argument("metric-name", metricName)
				.argument("dimensions", dimensions?.toString())
				.argument("next-token", nextToken)
	}

}


fun AmazonCloudWatchFunctions.putDashboard(dashboardName: String, dashboardBody: String, init: AmazonCloudWatchPutDashboardCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchPutDashboardCommand(dashboardName, dashboardBody).apply(init))
}

@Generated
class AmazonCloudWatchPutDashboardCommand(val dashboardName: String, val dashboardBody: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.PutDashboardRequest> {



	override fun build(): com.amazonaws.services.cloudwatch.model.PutDashboardRequest {
		val input = com.amazonaws.services.cloudwatch.model.PutDashboardRequest()
		input.setDashboardName(this.dashboardName)
		input.setDashboardBody(this.dashboardBody)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.putDashboard(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring put-dashboard")
				.argument("dashboard-name", dashboardName)
				.argument("dashboard-body", dashboardBody)
	}

}


fun AmazonCloudWatchFunctions.putMetricAlarm(alarmName: String, metricName: String, namespace: String, period: Int, evaluationPeriods: Int, threshold: Double, comparisonOperator: ComparisonOperator, init: AmazonCloudWatchPutMetricAlarmCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchPutMetricAlarmCommand(alarmName, metricName, namespace, period, evaluationPeriods, threshold, comparisonOperator).apply(init))
}

@Generated
class AmazonCloudWatchPutMetricAlarmCommand(val alarmName: String, val metricName: String, val namespace: String, val period: Int, val evaluationPeriods: Int, val threshold: Double, val comparisonOperator: ComparisonOperator) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest> {

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

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.putMetricAlarm(build())
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


fun AmazonCloudWatchFunctions.putMetricData(namespace: String, metricData: List<com.amazonaws.services.cloudwatch.model.MetricDatum>, init: AmazonCloudWatchPutMetricDataCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchPutMetricDataCommand(namespace, metricData).apply(init))
}

@Generated
class AmazonCloudWatchPutMetricDataCommand(val namespace: String, val metricData: List<com.amazonaws.services.cloudwatch.model.MetricDatum>) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.PutMetricDataRequest> {



	override fun build(): com.amazonaws.services.cloudwatch.model.PutMetricDataRequest {
		val input = com.amazonaws.services.cloudwatch.model.PutMetricDataRequest()
		input.setNamespace(this.namespace)
		input.setMetricData(this.metricData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.putMetricData(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring put-metric-data")
				.argument("namespace", namespace)
				.argument("metric-data", metricData.toString())
	}

}


fun AmazonCloudWatchFunctions.setAlarmState(alarmName: String, stateValue: StateValue, stateReason: String, init: AmazonCloudWatchSetAlarmStateCommand.() -> Unit) {
	this.block.declare(AmazonCloudWatchSetAlarmStateCommand(alarmName, stateValue, stateReason).apply(init))
}

@Generated
class AmazonCloudWatchSetAlarmStateCommand(val alarmName: String, val stateValue: StateValue, val stateReason: String) : AmazonWebServiceCommand<com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest> {

	var stateReasonData: String? = null

	override fun build(): com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest {
		val input = com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest()
		input.setAlarmName(this.alarmName)
		input.setStateValue(this.stateValue.toString())
		input.setStateReason(this.stateReason)
		input.setStateReasonData(this.stateReasonData)
		return input
	}

	override fun eval(environment: codingue.koops.core.Environment) {
		environment.monitoring.setAlarmState(build())
	}

	override fun descriptor(): AmazonWebServiceDescriptor {
		return AmazonWebServiceDescriptor("aws monitoring set-alarm-state")
				.argument("alarm-name", alarmName)
				.argument("state-value", stateValue.toString())
				.argument("state-reason", stateReason)
				.argument("state-reason-data", stateReasonData)
	}

}
