package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SamlProviderProps {

  def apply(
    metadataDocument: software.amazon.awscdk.services.iam.SamlMetadataDocument,
    name: Option[String] = None
  ): software.amazon.awscdk.services.iam.SamlProviderProps =
    (new software.amazon.awscdk.services.iam.SamlProviderProps.Builder)
      .metadataDocument(metadataDocument)
      .name(name.orNull)
      .build()
}
