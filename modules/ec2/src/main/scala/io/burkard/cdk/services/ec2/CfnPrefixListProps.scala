package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPrefixListProps {

  def apply(
    maxEntries: Number,
    prefixListName: String,
    addressFamily: String,
    entries: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnPrefixListProps =
    (new software.amazon.awscdk.services.ec2.CfnPrefixListProps.Builder)
      .maxEntries(maxEntries)
      .prefixListName(prefixListName)
      .addressFamily(addressFamily)
      .entries(entries.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
