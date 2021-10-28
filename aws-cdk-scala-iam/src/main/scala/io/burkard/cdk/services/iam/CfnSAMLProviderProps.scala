package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSAMLProviderProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    samlMetadataDocument: Option[String] = None
  ): software.amazon.awscdk.services.iam.CfnSAMLProviderProps =
    (new software.amazon.awscdk.services.iam.CfnSAMLProviderProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .samlMetadataDocument(samlMetadataDocument.orNull)
      .build()
}
