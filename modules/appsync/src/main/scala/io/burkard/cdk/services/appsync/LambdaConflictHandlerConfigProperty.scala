package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaConflictHandlerConfigProperty {

  def apply(
    lambdaConflictHandlerArn: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty.Builder)
      .lambdaConflictHandlerArn(lambdaConflictHandlerArn.orNull)
      .build()
}
