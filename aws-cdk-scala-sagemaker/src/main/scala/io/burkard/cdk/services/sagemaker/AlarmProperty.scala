package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AlarmProperty {

  def apply(
    alarmName: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty.Builder)
      .alarmName(alarmName.orNull)
      .build()
}
