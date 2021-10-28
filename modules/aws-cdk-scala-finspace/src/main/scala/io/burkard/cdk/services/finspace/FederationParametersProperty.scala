package io.burkard.cdk.services.finspace

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FederationParametersProperty {

  def apply(
    attributeMap: Option[AnyRef] = None,
    applicationCallBackUrl: Option[String] = None,
    samlMetadataDocument: Option[String] = None,
    samlMetadataUrl: Option[String] = None,
    federationUrn: Option[String] = None,
    federationProviderName: Option[String] = None
  ): software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty =
    (new software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty.Builder)
      .attributeMap(attributeMap.orNull)
      .applicationCallBackUrl(applicationCallBackUrl.orNull)
      .samlMetadataDocument(samlMetadataDocument.orNull)
      .samlMetadataUrl(samlMetadataUrl.orNull)
      .federationUrn(federationUrn.orNull)
      .federationProviderName(federationProviderName.orNull)
      .build()
}
