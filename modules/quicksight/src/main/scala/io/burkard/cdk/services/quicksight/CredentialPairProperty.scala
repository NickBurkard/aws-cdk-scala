package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CredentialPairProperty {

  def apply(
    username: String,
    password: String,
    alternateDataSourceParameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty.Builder)
      .username(username)
      .password(password)
      .alternateDataSourceParameters(alternateDataSourceParameters.map(_.asJava).orNull)
      .build()
}
