package io.burkard.cdk.services.dynamodb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TableAttributes {

  def apply(
    tableStreamArn: Option[String] = None,
    globalIndexes: Option[List[String]] = None,
    tableName: Option[String] = None,
    localIndexes: Option[List[String]] = None,
    tableArn: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.dynamodb.TableAttributes =
    (new software.amazon.awscdk.services.dynamodb.TableAttributes.Builder)
      .tableStreamArn(tableStreamArn.orNull)
      .globalIndexes(globalIndexes.map(_.asJava).orNull)
      .tableName(tableName.orNull)
      .localIndexes(localIndexes.map(_.asJava).orNull)
      .tableArn(tableArn.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
