package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SamlProvider {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    metadataDocument: Option[software.amazon.awscdk.services.iam.SamlMetadataDocument] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.SamlProvider =
    software.amazon.awscdk.services.iam.SamlProvider.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .metadataDocument(metadataDocument.orNull)
      .build()
}
