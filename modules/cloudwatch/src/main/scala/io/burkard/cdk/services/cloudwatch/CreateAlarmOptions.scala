package io.burkard.cdk.services.cloudwatch

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CreateAlarmOptions {

  def apply(
    statistic: Option[String] = None,
    evaluateLowSampleCountPercentile: Option[String] = None,
    datapointsToAlarm: Option[Number] = None,
    comparisonOperator: Option[software.amazon.awscdk.services.cloudwatch.ComparisonOperator] = None,
    treatMissingData: Option[software.amazon.awscdk.services.cloudwatch.TreatMissingData] = None,
    threshold: Option[Number] = None,
    actionsEnabled: Option[Boolean] = None,
    evaluationPeriods: Option[Number] = None,
    alarmDescription: Option[String] = None,
    alarmName: Option[String] = None,
    period: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions =
    (new software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions.Builder)
      .statistic(statistic.orNull)
      .evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile.orNull)
      .datapointsToAlarm(datapointsToAlarm.orNull)
      .comparisonOperator(comparisonOperator.orNull)
      .treatMissingData(treatMissingData.orNull)
      .threshold(threshold.orNull)
      .actionsEnabled(actionsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .evaluationPeriods(evaluationPeriods.orNull)
      .alarmDescription(alarmDescription.orNull)
      .alarmName(alarmName.orNull)
      .period(period.orNull)
      .build()
}
