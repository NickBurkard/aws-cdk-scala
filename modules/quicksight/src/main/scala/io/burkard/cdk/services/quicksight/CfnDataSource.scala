package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDataSource {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    sslProperties: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dataSourceId: Option[String] = None,
    dataSourceParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty] = None,
    permissions: Option[List[_]] = None,
    alternateDataSourceParameters: Option[List[_]] = None,
    `type`: Option[String] = None,
    awsAccountId: Option[String] = None,
    errorInfo: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty] = None,
    credentials: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty] = None,
    vpcConnectionProperties: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.quicksight.CfnDataSource =
    software.amazon.awscdk.services.quicksight.CfnDataSource.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .sslProperties(sslProperties.orNull)
      .tags(tags.map(_.asJava).orNull)
      .dataSourceId(dataSourceId.orNull)
      .dataSourceParameters(dataSourceParameters.orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .alternateDataSourceParameters(alternateDataSourceParameters.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .awsAccountId(awsAccountId.orNull)
      .errorInfo(errorInfo.orNull)
      .credentials(credentials.orNull)
      .vpcConnectionProperties(vpcConnectionProperties.orNull)
      .build()
}
