package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnKeyGroup {

  def apply(
    internalResourceId: String,
    keyGroupConfig: software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CfnKeyGroup =
    software.amazon.awscdk.services.cloudfront.CfnKeyGroup.Builder
      .create(stackCtx, internalResourceId)
      .keyGroupConfig(keyGroupConfig)
      .build()
}
