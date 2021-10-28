package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SamlProviderProps {

  def apply(
    name: Option[String] = None,
    metadataDocument: Option[software.amazon.awscdk.services.iam.SamlMetadataDocument] = None
  ): software.amazon.awscdk.services.iam.SamlProviderProps =
    (new software.amazon.awscdk.services.iam.SamlProviderProps.Builder)
      .name(name.orNull)
      .metadataDocument(metadataDocument.orNull)
      .build()
}
