package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DocumentMetadataConfigurationProperty {

  def apply(
    name: Option[String] = None,
    relevance: Option[software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty] = None,
    `type`: Option[String] = None,
    search: Option[software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty.Builder)
      .name(name.orNull)
      .relevance(relevance.orNull)
      .`type`(`type`.orNull)
      .search(search.orNull)
      .build()
}
