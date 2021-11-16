package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaConfigProperty {

  def apply(
    lambdaFunctionArn: String
  ): software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty.Builder)
      .lambdaFunctionArn(lambdaFunctionArn)
      .build()
}
