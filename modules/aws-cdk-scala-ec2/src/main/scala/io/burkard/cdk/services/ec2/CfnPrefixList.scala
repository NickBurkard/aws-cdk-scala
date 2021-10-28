package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPrefixList {

  def apply(
    internalResourceId: String,
    entries: Option[List[_]] = None,
    maxEntries: Option[Number] = None,
    prefixListName: Option[String] = None,
    addressFamily: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnPrefixList =
    software.amazon.awscdk.services.ec2.CfnPrefixList.Builder
      .create(stackCtx, internalResourceId)
      .entries(entries.map(_.asJava).orNull)
      .maxEntries(maxEntries.orNull)
      .prefixListName(prefixListName.orNull)
      .addressFamily(addressFamily.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
