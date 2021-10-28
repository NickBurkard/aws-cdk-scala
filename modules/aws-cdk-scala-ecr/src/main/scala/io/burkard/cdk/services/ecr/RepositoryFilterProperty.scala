package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RepositoryFilterProperty {

  def apply(
    filterType: Option[String] = None,
    filter: Option[String] = None
  ): software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty =
    (new software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty.Builder)
      .filterType(filterType.orNull)
      .filter(filter.orNull)
      .build()
}
