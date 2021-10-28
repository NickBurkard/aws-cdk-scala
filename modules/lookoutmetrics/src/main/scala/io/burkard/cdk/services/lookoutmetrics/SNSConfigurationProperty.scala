package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SNSConfigurationProperty {

  def apply(
    roleArn: Option[String] = None,
    snsTopicArn: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty.Builder)
      .roleArn(roleArn.orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .build()
}
