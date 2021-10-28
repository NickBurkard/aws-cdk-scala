package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMultiRegionAccessPointPolicyProps {

  def apply(
    mrapName: Option[String] = None,
    policy: Option[AnyRef] = None
  ): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps =
    (new software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps.Builder)
      .mrapName(mrapName.orNull)
      .policy(policy.orNull)
      .build()
}