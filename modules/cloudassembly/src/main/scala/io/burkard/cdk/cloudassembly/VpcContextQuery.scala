package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcContextQuery {

  def apply(
    filter: Map[String, String],
    region: String,
    account: String,
    returnAsymmetricSubnets: Option[Boolean] = None,
    subnetGroupNameTag: Option[String] = None,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.VpcContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.VpcContextQuery.Builder)
      .filter(filter.asJava)
      .region(region)
      .account(account)
      .returnAsymmetricSubnets(returnAsymmetricSubnets.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .subnetGroupNameTag(subnetGroupNameTag.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
