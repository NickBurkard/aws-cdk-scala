package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnKeyGroupProps {

  def apply(
    keyGroupConfig: software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty
  ): software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps =
    (new software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps.Builder)
      .keyGroupConfig(keyGroupConfig)
      .build()
}
