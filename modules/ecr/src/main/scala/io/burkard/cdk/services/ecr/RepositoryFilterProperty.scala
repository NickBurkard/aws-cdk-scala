package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RepositoryFilterProperty {

  def apply(
    filterType: String,
    filter: String
  ): software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty =
    (new software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty.Builder)
      .filterType(filterType)
      .filter(filter)
      .build()
}
