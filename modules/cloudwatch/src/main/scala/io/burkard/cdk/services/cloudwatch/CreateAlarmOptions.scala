package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CreateAlarmOptions {

  def apply(
    evaluateLowSampleCountPercentile: Option[String] = None,
    datapointsToAlarm: Option[Number] = None,
    comparisonOperator: Option[software.amazon.awscdk.services.cloudwatch.ComparisonOperator] = None,
    treatMissingData: Option[software.amazon.awscdk.services.cloudwatch.TreatMissingData] = None,
    threshold: Option[Number] = None,
    actionsEnabled: Option[Boolean] = None,
    evaluationPeriods: Option[Number] = None,
    alarmName: Option[String] = None,
    alarmDescription: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions =
    (new software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions.Builder)
      .evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile.orNull)
      .datapointsToAlarm(datapointsToAlarm.orNull)
      .comparisonOperator(comparisonOperator.orNull)
      .treatMissingData(treatMissingData.orNull)
      .threshold(threshold.orNull)
      .actionsEnabled(actionsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .evaluationPeriods(evaluationPeriods.orNull)
      .alarmName(alarmName.orNull)
      .alarmDescription(alarmDescription.orNull)
      .build()
}
