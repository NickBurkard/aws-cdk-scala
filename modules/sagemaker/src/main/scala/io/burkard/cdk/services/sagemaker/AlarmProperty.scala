package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlarmProperty {

  def apply(
    alarmName: String
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.AlarmProperty.Builder)
      .alarmName(alarmName)
      .build()
}
