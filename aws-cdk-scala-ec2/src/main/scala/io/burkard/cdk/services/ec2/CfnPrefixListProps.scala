package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPrefixListProps {

  def apply(
    entries: Option[List[_]] = None,
    maxEntries: Option[Number] = None,
    prefixListName: Option[String] = None,
    addressFamily: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnPrefixListProps =
    (new software.amazon.awscdk.services.ec2.CfnPrefixListProps.Builder)
      .entries(entries.map(_.asJava).orNull)
      .maxEntries(maxEntries.orNull)
      .prefixListName(prefixListName.orNull)
      .addressFamily(addressFamily.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
