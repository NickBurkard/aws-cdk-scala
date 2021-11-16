package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMultiRegionAccessPointPolicyProps {

  def apply(
    mrapName: String,
    policy: AnyRef
  ): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps =
    (new software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps.Builder)
      .mrapName(mrapName)
      .policy(policy)
      .build()
}
