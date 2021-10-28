package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnKeyGroupProps {

  def apply(
    keyGroupConfig: Option[software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps =
    (new software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps.Builder)
      .keyGroupConfig(keyGroupConfig.orNull)
      .build()
}
