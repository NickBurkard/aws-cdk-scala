package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnParametersCodeProps {

  def apply(
    objectKeyParam: Option[software.amazon.awscdk.CfnParameter] = None,
    bucketNameParam: Option[software.amazon.awscdk.CfnParameter] = None
  ): software.amazon.awscdk.services.lambda.CfnParametersCodeProps =
    (new software.amazon.awscdk.services.lambda.CfnParametersCodeProps.Builder)
      .objectKeyParam(objectKeyParam.orNull)
      .bucketNameParam(bucketNameParam.orNull)
      .build()
}
