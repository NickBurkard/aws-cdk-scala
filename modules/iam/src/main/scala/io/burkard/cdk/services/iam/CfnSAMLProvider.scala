package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSAMLProvider {

  def apply(
    internalResourceId: String,
    samlMetadataDocument: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnSAMLProvider =
    software.amazon.awscdk.services.iam.CfnSAMLProvider.Builder
      .create(stackCtx, internalResourceId)
      .samlMetadataDocument(samlMetadataDocument)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
