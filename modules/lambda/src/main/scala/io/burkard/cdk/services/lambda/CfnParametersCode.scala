package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnParametersCode {

  def apply(
    objectKeyParam: Option[software.amazon.awscdk.CfnParameter] = None,
    bucketNameParam: Option[software.amazon.awscdk.CfnParameter] = None
  ): software.amazon.awscdk.services.lambda.CfnParametersCode =
    software.amazon.awscdk.services.lambda.CfnParametersCode.Builder
      .create()
      .objectKeyParam(objectKeyParam.orNull)
      .bucketNameParam(bucketNameParam.orNull)
      .build()
}
