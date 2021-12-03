package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SyncConfigProperty {

  def apply(
    conflictDetection: String,
    lambdaConflictHandlerConfig: Option[software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty] = None,
    conflictHandler: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty.Builder)
      .conflictDetection(conflictDetection)
      .lambdaConflictHandlerConfig(lambdaConflictHandlerConfig.orNull)
      .conflictHandler(conflictHandler.orNull)
      .build()
}
