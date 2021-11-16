package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DocumentMetadataConfigurationProperty {

  def apply(
    name: String,
    `type`: String,
    relevance: Option[software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty] = None,
    search: Option[software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty.Builder)
      .name(name)
      .`type`(`type`)
      .relevance(relevance.orNull)
      .search(search.orNull)
      .build()
}
