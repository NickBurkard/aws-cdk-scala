package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlarmProperty {

  def apply(
    alarmName: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty.Builder)
      .alarmName(alarmName.orNull)
      .build()
}
