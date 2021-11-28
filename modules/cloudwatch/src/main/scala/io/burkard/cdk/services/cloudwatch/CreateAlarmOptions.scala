package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CreateAlarmOptions {

  def apply(
    threshold: Number,
    evaluationPeriods: Number,
    evaluateLowSampleCountPercentile: Option[String] = None,
    datapointsToAlarm: Option[Number] = None,
    comparisonOperator: Option[software.amazon.awscdk.services.cloudwatch.ComparisonOperator] = None,
    treatMissingData: Option[software.amazon.awscdk.services.cloudwatch.TreatMissingData] = None,
    actionsEnabled: Option[Boolean] = None,
    alarmName: Option[String] = None,
    alarmDescription: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions =
    (new software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions.Builder)
      .threshold(threshold)
      .evaluationPeriods(evaluationPeriods)
      .evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile.orNull)
      .datapointsToAlarm(datapointsToAlarm.orNull)
      .comparisonOperator(comparisonOperator.orNull)
      .treatMissingData(treatMissingData.orNull)
      .actionsEnabled(actionsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .alarmName(alarmName.orNull)
      .alarmDescription(alarmDescription.orNull)
      .build()
}
