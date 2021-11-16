package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AmiContextQuery {

  def apply(
    filters: Map[String, _ <: List[String]],
    region: String,
    account: String,
    owners: Option[List[String]] = None,
    lookupRoleArn: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.AmiContextQuery =
    (new software.amazon.awscdk.cloudassembly.schema.AmiContextQuery.Builder)
      .filters(filters.mapValues(_.asJava).toMap.asJava)
      .region(region)
      .account(account)
      .owners(owners.map(_.asJava).orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .build()
}
