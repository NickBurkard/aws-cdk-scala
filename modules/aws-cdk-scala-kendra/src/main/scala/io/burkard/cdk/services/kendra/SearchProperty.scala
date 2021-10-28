package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SearchProperty {

  def apply(
    facetable: Option[Boolean] = None,
    sortable: Option[Boolean] = None,
    displayable: Option[Boolean] = None,
    searchable: Option[Boolean] = None
  ): software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty.Builder)
      .facetable(facetable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sortable(sortable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .displayable(displayable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .searchable(searchable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
