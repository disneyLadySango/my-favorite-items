package jp.co.disney.lady.sango.disney.infrastructures.entities;

import lombok.Data;

import java.util.Date;

/**
 *
 * テーブル名； work_product
 * 作品登録用のテーブル
 *
 * @author disneyLadySango
 */
@Data
public class WorkProductEntity {
  /** ID AUTO_INCREMENT */
  private int id;
  /** 作品名 VARCHAR(255) */
  private String name;
  /** 作品概要 VARCHAR(1024) */
  private String description;
  /** 公開日時 */
  private Date releaseDate;
  /** 論理削除フラグ */
  private boolean deleteFlg;
  /** 作成日時 */
  private Date created;
  /** 更新日時 */
  private Date modified;
}
