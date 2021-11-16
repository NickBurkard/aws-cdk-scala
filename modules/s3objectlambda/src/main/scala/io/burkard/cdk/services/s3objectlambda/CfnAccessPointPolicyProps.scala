package io.burkard.cdk.services.s3objectlambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPointPolicyProps {

  def apply(
    objectLambdaAccessPoint: String,
    policyDocument: AnyRef
  ): software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps =
    (new software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps.Builder)
      .objectLambdaAccessPoint(objectLambdaAccessPoint)
      .policyDocument(policyDocument)
      .build()
}
