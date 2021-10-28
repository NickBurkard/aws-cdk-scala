package io.burkard.cdk.services.s3objectlambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAccessPointPolicy {

  def apply(
    internalResourceId: String,
    objectLambdaAccessPoint: Option[String] = None,
    policyDocument: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy =
    software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy.Builder
      .create(stackCtx, internalResourceId)
      .objectLambdaAccessPoint(objectLambdaAccessPoint.orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}
