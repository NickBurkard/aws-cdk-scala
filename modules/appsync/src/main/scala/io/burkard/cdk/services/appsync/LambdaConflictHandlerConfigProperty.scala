package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaConflictHandlerConfigProperty {

  def apply(
    lambdaConflictHandlerArn: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnResolver.LambdaConflictHandlerConfigProperty.Builder)
      .lambdaConflictHandlerArn(lambdaConflictHandlerArn.orNull)
      .build()
}
