package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAlarm {

  def apply(
    internalResourceId: String,
    statistic: Option[String] = None,
    insufficientDataActions: Option[List[String]] = None,
    evaluateLowSampleCountPercentile: Option[String] = None,
    okActions: Option[List[String]] = None,
    comparisonOperator: Option[String] = None,
    treatMissingData: Option[String] = None,
    threshold: Option[Number] = None,
    unit: Option[String] = None,
    alarmActions: Option[List[String]] = None,
    evaluationPeriods: Option[Number] = None,
    metricName: Option[String] = None,
    datapointsToAlarm: Option[Number] = None,
    dimensions: Option[List[_]] = None,
    thresholdMetricId: Option[String] = None,
    metrics: Option[List[_]] = None,
    actionsEnabled: Option[Boolean] = None,
    alarmName: Option[String] = None,
    period: Option[Number] = None,
    namespace: Option[String] = None,
    extendedStatistic: Option[String] = None,
    alarmDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudwatch.CfnAlarm =
    software.amazon.awscdk.services.cloudwatch.CfnAlarm.Builder
      .create(stackCtx, internalResourceId)
      .statistic(statistic.orNull)
      .insufficientDataActions(insufficientDataActions.map(_.asJava).orNull)
      .evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile.orNull)
      .okActions(okActions.map(_.asJava).orNull)
      .comparisonOperator(comparisonOperator.orNull)
      .treatMissingData(treatMissingData.orNull)
      .threshold(threshold.orNull)
      .unit(unit.orNull)
      .alarmActions(alarmActions.map(_.asJava).orNull)
      .evaluationPeriods(evaluationPeriods.orNull)
      .metricName(metricName.orNull)
      .datapointsToAlarm(datapointsToAlarm.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .thresholdMetricId(thresholdMetricId.orNull)
      .metrics(metrics.map(_.asJava).orNull)
      .actionsEnabled(actionsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .alarmName(alarmName.orNull)
      .period(period.orNull)
      .namespace(namespace.orNull)
      .extendedStatistic(extendedStatistic.orNull)
      .alarmDescription(alarmDescription.orNull)
      .build()
}
