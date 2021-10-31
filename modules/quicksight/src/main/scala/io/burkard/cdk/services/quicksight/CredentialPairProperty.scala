package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CredentialPairProperty {

  def apply(
    username: Option[String] = None,
    alternateDataSourceParameters: Option[List[_]] = None,
    password: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty.Builder)
      .username(username.orNull)
      .alternateDataSourceParameters(alternateDataSourceParameters.map(_.asJava).orNull)
      .password(password.orNull)
      .build()
}
