package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SyncConfigProperty {

  def apply(
    lambdaConflictHandlerConfig: Option[software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty] = None,
    conflictDetection: Option[String] = None,
    conflictHandler: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.SyncConfigProperty.Builder)
      .lambdaConflictHandlerConfig(lambdaConflictHandlerConfig.orNull)
      .conflictDetection(conflictDetection.orNull)
      .conflictHandler(conflictHandler.orNull)
      .build()
}
