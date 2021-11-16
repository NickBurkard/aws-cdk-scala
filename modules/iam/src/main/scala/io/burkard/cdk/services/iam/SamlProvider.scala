package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SamlProvider {

  def apply(
    internalResourceId: String,
    metadataDocument: software.amazon.awscdk.services.iam.SamlMetadataDocument,
    name: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.SamlProvider =
    software.amazon.awscdk.services.iam.SamlProvider.Builder
      .create(stackCtx, internalResourceId)
      .metadataDocument(metadataDocument)
      .name(name.orNull)
      .build()
}
