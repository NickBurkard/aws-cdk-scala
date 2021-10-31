package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccount {

  def apply(
    internalResourceId: String,
    cloudWatchRoleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnAccount =
    software.amazon.awscdk.services.apigateway.CfnAccount.Builder
      .create(stackCtx, internalResourceId)
      .cloudWatchRoleArn(cloudWatchRoleArn.orNull)
      .build()
}
