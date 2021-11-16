package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNamedQueryProps {

  def apply(
    database: String,
    queryString: String,
    workGroup: Option[String] = None,
    name: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.athena.CfnNamedQueryProps =
    (new software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder)
      .database(database)
      .queryString(queryString)
      .workGroup(workGroup.orNull)
      .name(name.orNull)
      .description(description.orNull)
      .build()
}
