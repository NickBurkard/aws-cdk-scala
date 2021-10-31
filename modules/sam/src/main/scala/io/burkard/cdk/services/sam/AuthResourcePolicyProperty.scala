package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthResourcePolicyProperty {

  def apply(
    ipRangeWhitelist: Option[List[String]] = None,
    awsAccountBlacklist: Option[List[String]] = None,
    intrinsicVpceBlacklist: Option[List[String]] = None,
    sourceVpcWhitelist: Option[List[String]] = None,
    intrinsicVpcWhitelist: Option[List[String]] = None,
    intrinsicVpceWhitelist: Option[List[String]] = None,
    sourceVpcBlacklist: Option[List[String]] = None,
    customStatements: Option[List[_]] = None,
    ipRangeBlacklist: Option[List[String]] = None,
    intrinsicVpcBlacklist: Option[List[String]] = None,
    awsAccountWhitelist: Option[List[String]] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty.Builder)
      .ipRangeWhitelist(ipRangeWhitelist.map(_.asJava).orNull)
      .awsAccountBlacklist(awsAccountBlacklist.map(_.asJava).orNull)
      .intrinsicVpceBlacklist(intrinsicVpceBlacklist.map(_.asJava).orNull)
      .sourceVpcWhitelist(sourceVpcWhitelist.map(_.asJava).orNull)
      .intrinsicVpcWhitelist(intrinsicVpcWhitelist.map(_.asJava).orNull)
      .intrinsicVpceWhitelist(intrinsicVpceWhitelist.map(_.asJava).orNull)
      .sourceVpcBlacklist(sourceVpcBlacklist.map(_.asJava).orNull)
      .customStatements(customStatements.map(_.asJava).orNull)
      .ipRangeBlacklist(ipRangeBlacklist.map(_.asJava).orNull)
      .intrinsicVpcBlacklist(intrinsicVpcBlacklist.map(_.asJava).orNull)
      .awsAccountWhitelist(awsAccountWhitelist.map(_.asJava).orNull)
      .build()
}
