package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SNSConfigurationProperty {

  def apply(
    roleArn: String,
    snsTopicArn: String
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty.Builder)
      .roleArn(roleArn)
      .snsTopicArn(snsTopicArn)
      .build()
}
