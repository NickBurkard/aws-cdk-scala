package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataLakePrincipalProperty {

  def apply(
    dataLakePrincipalIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty =
    (new software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty.Builder)
      .dataLakePrincipalIdentifier(dataLakePrincipalIdentifier.orNull)
      .build()
}
