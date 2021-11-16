package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSAMLProviderProps {

  def apply(
    samlMetadataDocument: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.iam.CfnSAMLProviderProps =
    (new software.amazon.awscdk.services.iam.CfnSAMLProviderProps.Builder)
      .samlMetadataDocument(samlMetadataDocument)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
