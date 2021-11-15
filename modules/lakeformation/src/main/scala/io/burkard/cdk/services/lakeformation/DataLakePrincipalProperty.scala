package io.burkard.cdk.services.lakeformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataLakePrincipalProperty {

  def apply(
    dataLakePrincipalIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty =
    (new software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings.DataLakePrincipalProperty.Builder)
      .dataLakePrincipalIdentifier(dataLakePrincipalIdentifier.orNull)
      .build()
}
