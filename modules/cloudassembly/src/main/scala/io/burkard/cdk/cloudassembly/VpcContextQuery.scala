package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcContextQuery {

  def apply(
    filter: Option[Map[String, String]] = None,
    returnAsymmetricSubnets: Option[Boolean] = None,
    subnetGroupNameTag: Option[String] = None,
    region: Option[String] = None,
    account: Option[String] = None,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.VpcContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.VpcContextQuery.Builder)
      .filter(filter.map(_.asJava).orNull)
      .returnAsymmetricSubnets(returnAsymmetricSubnets.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .subnetGroupNameTag(subnetGroupNameTag.orNull)
      .region(region.orNull)
      .account(account.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
