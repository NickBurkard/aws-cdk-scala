package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AmiContextQuery {

  def apply(
    owners: Option[List[String]] = None,
    filters: Option[Map[String, _ <: List[String]]] = None,
    region: Option[String] = None,
    account: Option[String] = None,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.AmiContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.AmiContextQuery.Builder)
      .owners(owners.map(_.asJava).orNull)
      .filters(filters.map(_.mapValues(_.asJava).toMap.asJava).orNull)
      .region(region.orNull)
      .account(account.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
